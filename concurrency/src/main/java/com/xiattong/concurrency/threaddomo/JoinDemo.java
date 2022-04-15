package com.xiattong.concurrency.threaddomo;
/**
 * @Description: join 测试
 * @Author: xiattong
 * @Date: 2020-12-10 19:08
 */
public class JoinDemo extends Thread{
    int i;
    Thread previousThread; //上一个线程
    public JoinDemo(Thread previousThread,int i){
        this.previousThread=previousThread;
        this.i=i;
    }
    @Override
    public void run() {
        try {
            //调用上一个线程的join方法，大家可以自己演示的时候可以把这行代码注释掉
            previousThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Haha:"+i);
    }
    
    public static void main(String[] args) {
        System.out.println("主线程开始。。。。");
        Thread previousThread=Thread.currentThread();
        for(int i=0;i<10;i++){
            JoinDemo joinDemo=new JoinDemo(previousThread,i);
            joinDemo.start();
            previousThread=joinDemo;
        }
        System.out.println("主线程结束。。。。");
    }
}
