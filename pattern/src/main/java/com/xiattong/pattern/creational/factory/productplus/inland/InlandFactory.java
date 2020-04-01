package com.xiattong.pattern.creational.factory.productplus.inland;

import com.xiattong.pattern.creational.factory.mode.IInlandPay;
import com.xiattong.pattern.creational.factory.mode.single.IInlandPaymentFactory;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:40
 */
public class InlandFactory implements IInlandPaymentFactory {
    public IInlandPay createInlandPay(Class<? extends IInlandPay> clazz)
            throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}
