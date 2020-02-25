package com.xiattong.pattern.factory.payment.product.wechat;

import com.xiattong.pattern.factory.payment.mode.IInlandPay;

/**
 *微信的境内支付类，实现境内支付接口
 * @Author: xiattong
 * @Date: 2020/2/25 14:17
 */
public class WeChatInlandPay implements IInlandPay{

    /** 微信境内支付*/
    public void inlandPay() {
        System.out.println("这是WeChat的境内支付方法！");
    }
}
