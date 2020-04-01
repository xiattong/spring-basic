package com.xiattong.concurrency.unit3;

import lombok.SneakyThrows;

/**
 * @Author: xiattong
 * @Date: 2020/3/2 20:48
 */
public class SynchronizedDemo implements Runnable{

    public void sysTest() throws InterruptedException {
        synchronized(SynchronizedDemo.class) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + ": sysTest start...");
            Thread.sleep(5000);
            System.out.println(threadName + ": sysTest end...");
        }
    }

    public void noSysTest(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ": noSysTest start...");
    }

    @SneakyThrows
    @Override
    public void run() {
        sysTest();
    }



    public static void main(String[] args) throws InterruptedException {

        SynchronizedDemo synchro = new SynchronizedDemo();
        Thread thread1 = new Thread(synchro,"thread-1");
        Thread thread2 = new Thread(new SynchronizedDemo(),"thread-2");

        thread1.start();
        thread2.start();
        synchro.noSysTest();
        synchro.sysTest();


    }


}
