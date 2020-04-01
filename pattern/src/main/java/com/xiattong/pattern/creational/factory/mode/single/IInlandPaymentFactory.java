package com.xiattong.pattern.creational.factory.mode.single;

import com.xiattong.pattern.creational.factory.mode.IInlandPay;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:37
 */
public interface IInlandPaymentFactory {
    IInlandPay createInlandPay(Class<? extends IInlandPay> clazz)
            throws IllegalAccessException, InstantiationException;
}
