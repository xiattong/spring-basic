package com.xiattong.concurrency.multi.unit1;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2022/3/23 21:03
 * @modified By：
 */
public class MyThread extends Thread{
    private int count = 50;

    public MyThread(String name) {
        this.setName(name);
    }
    @Override
    public void run() {
        while(count > 0) {
            count --;
            System.out.println("由 " + this.currentThread().getName() + " 计算，count = " + count );
        }
    }
}
