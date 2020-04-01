package com.xiattong.concurrency.unit4;

import sun.plugin.dom.DOMObject;

/**
 * @Author: xiattong
 * @Date: 2020/3/3 14:42
 */
public class Demo {
    public String name;
    public int num;


    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.name = "abc";
        demo.num = 111;
        System.out.println(demo.toString());

        demo.fun(demo);
        System.out.println(demo.toString());

    }

    public void fun(Demo demo){
        demo.name = "123";
        demo.num = 456;
    }
}
