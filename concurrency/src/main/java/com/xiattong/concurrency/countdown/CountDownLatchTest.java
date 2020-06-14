package com.xiattong.concurrency.countdown;

import com.sun.deploy.util.ReflectionUtil;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

/**
 * @Author: xiattong
 * @Date: 2020/3/24 22:26
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        int threadNum = 5;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            final int finalI = i + 1;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "正在运行。。。");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "运行完了");
                countDownLatch.countDown();
            },"child thread" + i).start();
        }

        try {
            //等待子线程执行完
            System.out.println("等待子线程执行完。。。");
            countDownLatch.await();
            System.out.println("子线程执行完了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadNum + " thread finish");
    }
}
