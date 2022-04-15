package com.xiattong.concurrency.threaddomo;

import java.util.concurrent.TimeUnit;

/**
 * @Description: 线程终端案列
 * @Author: xiattong
 * @Date: 2020-12-11 12:09
 */
public class InterruptedDemo implements Runnable{
    int i = 0;
    @Override
    public void run() {
        System.out.println("Run start: "+Thread.currentThread().getName());
        while(!Thread.currentThread().isInterrupted()) {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Do while: " + Thread.currentThread().getName() + "  i:" + i++);
        }
        System.out.println("Run end" + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterruptedDemo());
        thread.start();
        TimeUnit.SECONDS.sleep(2);
        thread.interrupt();
        System.out.println("SEE: " + thread.isInterrupted());
    }
}
