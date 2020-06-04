package com.xiattong.pattern.delegate.general;

public class Test {
    int i= 10;
    public static void main(String[] args) {
        Test test = new Test();

        test.add(test.i);
       System.out.println(test.i);
    }
    private  void add(int i){
        i = i + 1;
    }
}