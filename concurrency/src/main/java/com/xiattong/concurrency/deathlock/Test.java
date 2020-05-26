package com.xiattong.concurrency.deathlock;

public class Test implements Runnable{

    Test teeee;

    public synchronized void show(){
        System.out.println(Thread.currentThread().getName()+"show1");
        teeee.look();
        System.out.println(Thread.currentThread().getName()+"show2");
    }

    public synchronized void look(){
        System.out.println(Thread.currentThread().getName()+"look");
    }

    @Override
    public void run() {
        show();
    }

    public static void main(String[] args) {
        Test test = new Test();

        Thread thread1 = new Thread(test,"thread-1");
        Thread thread2 = new Thread(test,"thread-2");
        thread1.start();
        thread2.start();
    }
}
