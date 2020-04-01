package com.xiattong.pattern.creational.factory.product.alipay;

import com.xiattong.pattern.creational.factory.mode.IOutlandPay;

/**
 * 阿里的境外支付类，实现境外支付接口
 * @Author: xiattong
 * @Date: 2020/2/25 14:17
 */
public class AliOutlandPay implements IOutlandPay {

    /** 阿里境外支付*/
    public void outlandPay() {
        System.out.println("这是Alibaba的境外支付方法！");
    }
}
