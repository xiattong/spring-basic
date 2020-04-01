package com.xiattong.concurrency.unit3;

/**
 * @Author: xiattong
 * @Date: 2020/2/28 12:01
 */
public class UnsafeStates {
    private String[] states = new String[]{"1","2","3"};
    public String[] getStates(){
        return states;
    }
    public void showStates(){
        for(String em : states){
            System.out.println(em);
        }
    }

    public static void main(String[] args) {
        UnsafeStates unsafeStates = new UnsafeStates();
        String[] states = unsafeStates.getStates();
        states[2] = "4";
        unsafeStates.showStates();
    }
}
