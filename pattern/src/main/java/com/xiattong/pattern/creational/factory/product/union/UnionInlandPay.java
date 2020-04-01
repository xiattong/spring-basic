package com.xiattong.pattern.creational.factory.product.union;

import com.xiattong.pattern.creational.factory.mode.IInlandPay;

/**
 * 银联的境内支付类，实现境内支付接口
 * @Author: xiattong
 * @Date: 2020/2/25 14:17
 */
public class UnionInlandPay implements IInlandPay {

    /** 银联境内支付*/
    public void inlandPay() {
        System.out.println("这是Union的境内支付方法！");
    }
}
