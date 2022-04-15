package com.xiattong.principle.lishi;

/**
 * @author ：xiattong
 * @description：长方形
 * @version: $
 * @date ：Created in 2021/2/7 21:22
 * @modified By：
 */
public class Rectangle implements Quadrangle {
    private long width;
    private long height;

    public void setWidth(long width) {
        this.width = width;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getHeight() {
        return height;
    }
}
