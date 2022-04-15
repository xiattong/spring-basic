package com.xiattong.concurrency.multi.unit1;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2022/3/23 22:07
 * @modified By：
 */
public class Test2 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread("my-thread");
        Thread thread = new Thread(myThread);
        thread.start();
    }
}
