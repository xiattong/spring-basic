package com.xiattong.pattern.creational.factory.product.union;

import com.xiattong.pattern.creational.factory.mode.IInlandPay;
import com.xiattong.pattern.creational.factory.mode.IOutlandPay;
import com.xiattong.pattern.creational.factory.mode.united.IPaymentFactory;

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
