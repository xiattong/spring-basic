package com.xiattong.concurrency.threadlocal;

public class Test {
    public static void main(String[] args) {
        XtThreadLocal<String> threadLocal = new XtThreadLocal<>();

        XtThread thread_a = new XtThread();
        XtThread thread_b = new XtThread();

        threadLocal.set(thread_a,"this is thread a");
        threadLocal.set(thread_b,"this is thread b");

        System.out.println(threadLocal.get(thread_a));
        System.out.println(threadLocal.get(thread_b));
    }
}
