package com.xiattong.pattern.factory.payment.productplus.inland;

import com.xiattong.pattern.factory.payment.mode.IInlandPay;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:19
 */
public class AppleInlandPay implements IInlandPay {
    public void inlandPay() {
        System.out.println("这是苹果的境内支付方法");
    }
}
