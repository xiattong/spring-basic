package com.xiattong.concurrency.condition;

import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{

    private Queue<String> msg;

    private int maxSize;

    Lock lock;

    Condition condition;

    public Producer(Queue<String> msg, int maxSize, Lock lock, Condition condition) {
        this.msg = msg;
        this.maxSize = maxSize;
        this.lock = lock;
        this.condition = condition;
    }

    @SneakyThrows
    @Override
    public void run() {
        int i = 0;
        while(true){
            i++;
            //System.out.println("生产者i:"+i);
            lock.lock();
            while(msg.size() == maxSize) {
                System.out.println("生产者：队列满了，请等待。。。");
                condition.await(); //阻塞线程并释放锁
            }
            Thread.sleep(1000);
            System.out.println("生产消息："+i);
            msg.add("消息"+i);
            condition.signal();//唤醒阻塞状态下的线程  （当前线程会怎样？ExclusiveOwnerThread 会不会变更?)
            lock.unlock();
        }
    }
}


/*
 * 生产者i:1                       p 没抢到锁，阻塞在lock.lock()。
 *                                   aqs队列：p    wait队列：
 * 消费者：队列空了，请等待。。。    c  抢到锁后，因消息队列空，执行了 condition.await()，阻塞，进入wait队列并释放锁。
 *                                   aqs队列：p    wait队列：c
 * 生产消息：1                     p  抢到锁，继续运行，从aqs出列，
 *                                   执行了 condition.signal()，将wait队头（等待时间最长）线程放入到aqs队列中；
 *                                   aqs队列：c    wait队列：
 *                                   执行了 lock.unlock()； 释放了锁。
 * 生产者i:2                      p  继续运行，并在 lock.lock();处阻塞。原因是，c抢到了锁。c aqs出列，p aqs入列
 *                                   aqs队列：p    wait队列：
 * 消费消息：消息1                 c  抢到了锁，继续执行 。 注意：c是从condition.await()处继续往下执行的，它抢到锁之前并没有执行lock.lock()。
 *                                   aqs队列：p    wait队列：
 * 消费者：队列空了，请等待。。。    c  执行了 condition.await()，阻塞，进入wait队列并释放锁。
 *                                   aqs队列：p    wait队列：c
 * 生产消息：2                     p 抢到了锁，从 lock.lock(); 处继续执行。 p aqs出列
 *                                   aqs队列：    wait队列：c
 *                                  执行了 condition.signal(); 将wait队头（等待时间最长）线程放入到aqs队列中；
 *                                  aqs队列：c    wait队列：
 *                                  执行了 lock.unlock()； 释放了锁。
 * 生产者i:3                      p  继续运行，并在 lock.lock();处阻塞。原因是，c抢到了锁。c aqs出列，p aqs入列
 *                                  aqs队列：p    wait队列：
 * 消费消息：消息2                 c  抢到了锁，继续执行 。 注意：c是从condition.await()处继续往下执行的，它抢到锁之前并没有执行lock.lock()。
 *                                  aqs队列：p    wait队列：
 * 消费者：队列空了，请等待。。。   c  执行了 condition.await()，阻塞，进入wait队列并释放锁。
 * 生产消息：3                    以下循环过程，不写了。。。
 * 生产者i:4
 * 消费消息：消息3
 * 消费者：队列空了，请等待。。。
 * 生产消息：4
 * 生产者i:5
 * 消费消息：消息4
 * 消费者：队列空了，请等待。。。
 * 生产消息：5
 * 生产者i:6
 * 消费消息：消息5
 * 消费者：队列空了，请等待。。。
 */