package com.xiattong.pattern.factory.payment.productplus.outland;

import com.xiattong.pattern.factory.payment.mode.IOutlandPay;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:24
 */
public class MiOutlandPay implements IOutlandPay {
    public void outlandPay() {
        System.out.println("这是小米的境外支付方法");
    }
}
