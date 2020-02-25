package com.xiattong.pattern.factory.payment.productplus.outland;

import com.xiattong.pattern.factory.payment.mode.IOutlandPay;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:21
 */
public class HuaweiOutlandPay implements IOutlandPay {
    public void outlandPay() {
        System.out.println("这是华为的境外支付方法");
    }
}
