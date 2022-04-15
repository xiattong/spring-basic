package com.xiattong.concurrency.multi.unit2;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2022/4/14 23:39
 * @modified By：
 */
public class StaticTestRun {
    public static void main(String[] args) {
        StaticTest.InnerClass1 inne1 = new StaticTest.InnerClass1();
        StaticTest.InnerClass2 inne2 = new StaticTest.InnerClass2();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inne1.method1(inne2);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inne1.method2();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                inne2.method1();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
