package com.xiattong.concurrency.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/23 2:14
 * @modified By：
 */
public class UserThreadPool {
    public static void main(String[] args) {
        // 缓存队列设置固定长度为 2，为了快速触发 UserRejectHandler
        BlockingQueue queue = new LinkedBlockingDeque(2);

        UserThreadFactory factory1 = new UserThreadFactory("第一机房");
        UserThreadFactory factory2 = new UserThreadFactory("第二机房");

        UserRejectHandler rejectHandler = new UserRejectHandler ();

        // 核心线程为 1 , 最大线程为 2 , 为了保证触发 rejectHandler
        ThreadPoolExecutor threadPoolFirst
                = new ThreadPoolExecutor(1, 2,
                60, TimeUnit.SECONDS, queue, factory1, rejectHandler);

        ThreadPoolExecutor threadPoolSecond
                = new ThreadPoolExecutor(1, 2,
                60, TimeUnit.SECONDS, queue, factory2, rejectHandler);

        // 创建400个任务
        Task task = new Task();
        for (int i = 0 ; i < 100 ; i++) {
            threadPoolFirst.execute(task);
            threadPoolSecond.execute(task);
        }

    }
}
