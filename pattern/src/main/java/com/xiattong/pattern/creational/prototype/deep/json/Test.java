package com.xiattong.pattern.creational.prototype.deep.json;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiattong
 * @Date: 2020/3/1 16:26
 */
public class Test {
    public static void main(String[] args) {
        DemoBean demoBean = new DemoBean();
        demoBean.setName("DemoBean");
        demoBean.setNum(1);

        FiledBean filedBean = new FiledBean();
        filedBean.setFileMame("FiledBean");
        filedBean.setFileNum(2);
        demoBean.setFiledBean(filedBean);

        List<FiledBean> filedBeanList = new ArrayList<FiledBean>();
        filedBean = new FiledBean();
        filedBean.setFileMame("FiledBean-1");
        filedBean.setFileNum(3);
        filedBeanList.add(filedBean);
        filedBean = new FiledBean();
        filedBean.setFileMame("FiledBean-2");
        filedBean.setFileNum(4);
        filedBeanList.add(filedBean);
        demoBean.setFiledBeanList(filedBeanList);

        //使用Json克隆
        DemoBean cloneDemoBean = JSON.parseObject(JSON.toJSONString(demoBean),DemoBean.class);

        System.out.println("demoBean:"+demoBean.toString());
        System.out.println("cloneDemoBean:"+cloneDemoBean.toString());
        System.out.println(demoBean == cloneDemoBean);
    }
}
