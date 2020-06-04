package com.xiattong.concurrency.condition;

import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{
    private Queue<String> msg;

    private int maxSize;

    Lock lock;

    Condition condition;

    public Consumer(Queue<String> msg, int maxSize, Lock lock, Condition condition) {
        this.msg = msg;
        this.maxSize = maxSize;
        this.lock = lock;
        this.condition = condition;
    }

    @SneakyThrows
    @Override
    public void run() {
        while(true){
            lock.lock();
            while(msg.isEmpty()) {
                System.out.println("消费者：队列空了，请等待。。。");
                condition.await(); //阻塞线程并释放锁
            }
            Thread.sleep(1000);
            System.out.println("消费消息："+msg.remove());
            condition.signal();//唤醒阻塞状态下的线程
            lock.unlock();
        }
    }
}
