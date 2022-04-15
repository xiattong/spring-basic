package com.xiattong.concurrency.threadpool;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/23 2:07
 * @modified By：
 */
public class UserRejectHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected. " + executor.toString());
    }
}
