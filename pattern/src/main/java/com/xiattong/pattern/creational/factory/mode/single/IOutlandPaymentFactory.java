package com.xiattong.pattern.creational.factory.mode.single;

import com.xiattong.pattern.creational.factory.mode.IOutlandPay;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:39
 */
public interface IOutlandPaymentFactory {
    IOutlandPay createOutlandPay(Class<? extends IOutlandPay> clazz) throws IllegalAccessException, InstantiationException;
}
