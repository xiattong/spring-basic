package com.xiattong.pattern.factory.payment.mode.single;

import com.xiattong.pattern.factory.payment.mode.IInlandPay;

import java.sql.Array;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:37
 */
public interface IInlandPaymentFactory {
    IInlandPay createInlandPay(Class<? extends IInlandPay> clazz)
            throws IllegalAccessException, InstantiationException;
}
