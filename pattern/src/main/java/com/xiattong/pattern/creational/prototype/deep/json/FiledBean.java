package com.xiattong.pattern.creational.prototype.deep.json;

import lombok.Data;

/**
 * @Author: xiattong
 * @Date: 2020/3/1 16:00
 */
@Data
public class FiledBean {
    private String fileMame;
    private int fileNum;

    @Override
    public String toString() {
        return "FiledBean{" +
                "fileMame='" + fileMame + '\'' +
                ", fileNum=" + fileNum +
                '}';
    }
}
