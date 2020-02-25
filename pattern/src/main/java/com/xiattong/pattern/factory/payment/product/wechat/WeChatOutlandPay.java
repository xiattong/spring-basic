package com.xiattong.pattern.factory.payment.product.wechat;

import com.xiattong.pattern.factory.payment.mode.IOutlandPay;

/**
 * 微信的境外支付类，实现境外支付接口
 * @Author: xiattong
 * @Date: 2020/2/25 14:17
 */
public class WeChatOutlandPay implements IOutlandPay {

    /** 微信境外支付*/
    public void outlandPay() {
        System.out.println("这是WeChat的境外支付方法！");
    }
}
