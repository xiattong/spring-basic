package com.xiattong.concurrency.countdown;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: xiattong
 * @Date: 2020/3/24 22:52
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Vector<String> vector = new Vector<String>(2);
        vector.add("1");
        vector.add("1");
        vector.add("1");
        vector.add("1");

        for (String a:vector) {
            System.out.println(a);
        }
    }
}
