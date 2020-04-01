package com.xiattong.pattern.creational.prototype.deep.json;

import lombok.Data;

import java.util.List;

/**
 * @Author: xiattong
 * @Date: 2020/3/1 16:00
 */
@Data
public class DemoBean {
    private String name;
    private int num;
    private FiledBean filedBean;
    private List<FiledBean> filedBeanList;

    @Override
    public String toString() {
        return "DemoBean{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", filedBean=" + filedBean.toString() +
                ", filedBeanList=" + filedBeanList +
                "}";
    }
}
