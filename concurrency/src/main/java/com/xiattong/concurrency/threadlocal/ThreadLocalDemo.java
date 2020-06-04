package com.xiattong.concurrency.threadlocal;

public class ThreadLocalDemo {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    public static ThreadLocal<String> threadLocal_cn = new ThreadLocal<String>();
    public static void main(String[] args) {
        ThreadLocalDemo.threadLocal.set("hello world main");
        ThreadLocalDemo.threadLocal_cn.set("你好 Main");
        System.out.println(ThreadLocalDemo.threadLocal.get());
        System.out.println(ThreadLocalDemo.threadLocal_cn.get());
        try {
            Thread thread = new Thread() {
                public void run() {
                    ThreadLocalDemo.threadLocal.set("hello world thread");
                    ThreadLocalDemo.threadLocal_cn.set("你好 thread");
                    System.out.println(ThreadLocalDemo.threadLocal.get());
                    System.out.println(ThreadLocalDemo.threadLocal_cn.get());
                };
            };
            thread.start();
            thread.join();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(ThreadLocalDemo.threadLocal.get());
        System.out.println(ThreadLocalDemo.threadLocal_cn.get());
    }
}
