package com.xiattong.concurrency.unit3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiattong
 * @Date: 2020/2/29 23:40
 */
public final class FinalDemo {
     final String name;
     final int age;
     public FinalDemo(String name,int age){
         this.name = name;
         this.age = age;
     }

    @Override
    public String toString() {
        return "FinalDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo("xiatt",18);
        //finalDemo.age = 20;
        System.out.println(finalDemo.toString());
    }
}
