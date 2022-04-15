package com.xiattong.concurrency.threadpool;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ：xiattong
 * @description：线程池工厂
 * @version: $
 * @date ：Created in 2021/4/22 23:27
 * @modified By：
 */
public class UserThreadFactory implements ThreadFactory {

    private final String namePrefix;

    private final AtomicInteger nextId = new AtomicInteger(1);

    public UserThreadFactory(String whatFeatureOfGroup) {
        this.namePrefix = "UserThreadFactory·s " + whatFeatureOfGroup + "-Worker-";
    }

    @Override
    public Thread newThread(Runnable task) {
        String name = namePrefix + nextId.getAndIncrement();
        Thread thread = new Thread(null, task, name);
        System.out.println(thread.getName());
        return thread;
    }
}
