package com.xiattong.pattern.structural.composite.demo.transparent;

/**
 * Created by Tom.
 */
public abstract class CourseComponent {

    public void addChild(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }


    public String getName(){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }


    public double getPrice(){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }


    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
