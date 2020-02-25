package com.xiattong.pattern.factory.payment.mode.single;

import com.xiattong.pattern.factory.payment.mode.IOutlandPay;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:39
 */
public interface IOutlandPaymentFactory {
    IOutlandPay createOutlandPay(Class<? extends IOutlandPay> clazz) throws IllegalAccessException, InstantiationException;
}
