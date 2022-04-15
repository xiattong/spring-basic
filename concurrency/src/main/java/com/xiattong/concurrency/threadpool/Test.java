package com.xiattong.concurrency.threadpool;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/23 17:48
 * @modified By：
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("RUNNING");
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1 << 29));
        System.out.println();

        System.out.println("SHUTDOWN");
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Integer.toBinaryString(0 << 29));
        System.out.println();

        System.out.println("STOP");
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(1 << 29));
        System.out.println();

        System.out.println("TIDYING");
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(2 << 29));
        System.out.println();

        System.out.println("TERMINATED");
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(3 << 29));
        System.out.println();

        System.out.println("COUNT_MASK");
        System.out.println(Integer.toBinaryString((1 << 29) - 1));
    }
}
