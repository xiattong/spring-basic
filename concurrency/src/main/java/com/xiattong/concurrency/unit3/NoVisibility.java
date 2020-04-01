package com.xiattong.concurrency.unit3;

/**
 * @Author: xiattong
 * @Date: 2020/2/28 9:07
 */
public class NoVisibility {
    private static boolean ready = false;
    private static int number = 0;

    public static class ReaderThread extends Thread{
        public void run(){
            while(!ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 10;
        ready = true;
    }
}
