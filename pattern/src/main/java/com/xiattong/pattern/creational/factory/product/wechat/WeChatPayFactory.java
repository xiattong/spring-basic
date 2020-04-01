package com.xiattong.pattern.creational.factory.product.wechat;

import com.xiattong.pattern.creational.factory.mode.IInlandPay;
import com.xiattong.pattern.creational.factory.mode.IOutlandPay;
import com.xiattong.pattern.creational.factory.mode.united.IPaymentFactory;

/**
 * 微信支付工厂
 * @Author: xiattong
 * @Date: 2020/2/25 14:23
 */
public class WeChatPayFactory implements IPaymentFactory {
    public IInlandPay createInlandPay() {
        return new WeChatInlandPay();
    }

    public IOutlandPay createOutlandPay() {
        return new WeChatOutlandPay();
    }
}
