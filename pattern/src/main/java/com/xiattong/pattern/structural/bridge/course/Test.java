package com.xiattong.pattern.structural.bridge.course;

/**
 * @Author: xiattong
 * @Date: 2020/3/18 23:21
 */
public class Test {
    public static void main(String[] args) {
        AbstractCourse javaCourse = new JavaCourse();
        javaCourse.setNote(new JavaNote());
        javaCourse.setVideo(new JavaVideo());

        System.out.println(javaCourse.toString());
    }
}
