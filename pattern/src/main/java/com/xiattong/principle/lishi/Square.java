package com.xiattong.principle.lishi;

/**
 * @author ：xiattong
 * @description：正方形类
 * @version: $
 * @date ：Created in 2021/2/7 21:24
 * @modified By：
 */
public class Square implements Quadrangle{

    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return 0;
    }

    @Override
    public long getHeight() {
        return 0;
    }
}
