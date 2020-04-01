package com.xiattong.pattern.creational.factory.productplus.inland;

import com.xiattong.pattern.creational.factory.mode.IInlandPay;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:20
 */
public class HuaweiInlandPay implements IInlandPay {
    public void inlandPay() {
        System.out.println("这是华为的境内支付方法");
    }
}
