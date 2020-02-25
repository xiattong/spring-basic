package com.xiattong.pattern.factory.payment.productplus.outland;

import com.xiattong.pattern.factory.payment.mode.IOutlandPay;
import com.xiattong.pattern.factory.payment.mode.single.IOutlandPaymentFactory;

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
