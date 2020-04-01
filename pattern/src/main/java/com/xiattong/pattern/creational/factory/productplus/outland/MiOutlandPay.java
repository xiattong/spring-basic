package com.xiattong.pattern.creational.factory.productplus.outland;

import com.xiattong.pattern.creational.factory.mode.IOutlandPay;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:24
 */
public class MiOutlandPay implements IOutlandPay {
    public void outlandPay() {
        System.out.println("这是小米的境外支付方法");
    }
}
