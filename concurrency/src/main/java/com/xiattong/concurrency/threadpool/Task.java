package com.xiattong.concurrency.threadpool;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/23 2:29
 * @modified By：
 */
public class Task implements Runnable{
    AtomicLong count = new AtomicLong(0L);
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "running:" + count.getAndIncrement());
    }
}
