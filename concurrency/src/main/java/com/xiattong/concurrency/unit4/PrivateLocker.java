package com.xiattong.concurrency.unit4;

/**
 * 私有锁的例子
 * @Author: xiattong
 * @Date: 2020/3/3 13:48
 */
public class PrivateLocker {
    private final Object lock = new Object();

    Object lala;

    public void someMethod(){
        synchronized (lock){
            //对lala做点什么
        }
    }
}
