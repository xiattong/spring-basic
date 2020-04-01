package com.xiattong.pattern.creational.factory.productplus.outland;

import com.xiattong.pattern.creational.factory.mode.IOutlandPay;
import com.xiattong.pattern.creational.factory.mode.single.IOutlandPaymentFactory;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 23:40
 */
public class OutlandPayFactory implements IOutlandPaymentFactory {
    public IOutlandPay createOutlandPay(Class<? extends IOutlandPay> clazz)
            throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}
