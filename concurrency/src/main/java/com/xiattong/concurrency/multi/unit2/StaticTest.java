package com.xiattong.concurrency.multi.unit2;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2022/4/14 23:25
 * @modified By：
 */
public class StaticTest {

    public static class InnerClass1 {
        public void method1(InnerClass2 class2) {
            String threadName = Thread.currentThread().getName();
            // 对象锁, 锁的是 class2 对象
            synchronized (class2) {
                System.out.println(threadName + "进入 InnerClass1 - method1");
                for (int i = 0; i< 10 ; i++) {
                    System.out.println("i = " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(threadName + "离开 InnerClass1 - method1");
            }
        }

        public synchronized void method2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "进入 InnerClass1 - method2");
            for (int j = 0; j< 10 ; j++) {
                System.out.println("j = " + j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println(threadName + "离开 InnerClass1 - method2");
        }
    }

    public static class InnerClass2 {
        // 也是对象锁, 锁的是 class2 对象
        public synchronized void method1() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "进入 InnerClass2 - method1");
            for (int k = 0; k< 10 ; k++) {
                System.out.println("k = " + k);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println(threadName + "离开 InnerClass2 - method1");
        }
    }
}
