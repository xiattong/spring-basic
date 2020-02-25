package com.xiattong.pattern.factory.payment.product.union;

import com.xiattong.pattern.factory.payment.mode.IInlandPay;
import com.xiattong.pattern.factory.payment.mode.IOutlandPay;
import com.xiattong.pattern.factory.payment.mode.united.IPaymentFactory;

/**
 * 银联支付工厂
 * @Author: xiattong
 * @Date: 2020/2/25 14:23
 */
public class UnionPayFactory implements IPaymentFactory {

    public IInlandPay createInlandPay() {
        return new UnionInlandPay();
    }

    public IOutlandPay createOutlandPay() {
        return new UnionOutlandPay();
    }
}
