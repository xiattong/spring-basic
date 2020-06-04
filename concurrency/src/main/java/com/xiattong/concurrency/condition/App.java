package com.xiattong.concurrency.condition;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        int maxSize = 5;
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();


        Producer producer = new Producer(queue,maxSize,lock,condition);
        Consumer consumer = new Consumer(queue,maxSize,lock,condition);

        Thread pduThread = new Thread(producer);
        Thread csuThread = new Thread(consumer);

        pduThread.start();
        csuThread.start();
    }
}
