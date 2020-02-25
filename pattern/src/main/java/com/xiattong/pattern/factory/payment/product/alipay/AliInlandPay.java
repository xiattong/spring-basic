package com.xiattong.pattern.factory.payment.product.alipay;

import com.xiattong.pattern.factory.payment.mode.IInlandPay;

/**
 * 阿里的境内支付类，实现境内支付接口
 * @Author: xiattong
 * @Date: 2020/2/25 14:17
 */
public class AliInlandPay implements IInlandPay{

    /** 阿里境内支付*/
    public void inlandPay() {
        System.out.println("这是Alibaba的境内支付方法！");
    }
}
