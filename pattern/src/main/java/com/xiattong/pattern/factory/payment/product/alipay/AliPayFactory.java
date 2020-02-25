package com.xiattong.pattern.factory.payment.product.alipay;

import com.xiattong.pattern.factory.payment.mode.IInlandPay;
import com.xiattong.pattern.factory.payment.mode.IOutlandPay;
import com.xiattong.pattern.factory.payment.mode.united.IPaymentFactory;

/**
 * 阿里支付工厂
 * @Author: xiattong
 * @Date: 2020/2/25 14:23
 */
public class AliPayFactory implements IPaymentFactory {

    public IInlandPay createInlandPay() {
        return new AliInlandPay();
    }

    public IOutlandPay createOutlandPay() {
        return new AliOutlandPay();
    }
}
