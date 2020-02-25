package com.xiattong.pattern.factory.payment.productplus;

import com.xiattong.pattern.factory.payment.productplus.inland.AppleInlandPay;
import com.xiattong.pattern.factory.payment.productplus.inland.HuaweiInlandPay;
import com.xiattong.pattern.factory.payment.productplus.inland.InlandFactory;
import com.xiattong.pattern.factory.payment.productplus.outland.HuaweiOutlandPay;
import com.xiattong.pattern.factory.payment.productplus.outland.MiOutlandPay;
import com.xiattong.pattern.factory.payment.productplus.outland.OutlandPayFactory;

/**
 * @Author: xiattong
 * @Date: 2020/2/26 0:10
 */
public class TestPlus {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException {
        InlandFactory inlandFactory = new InlandFactory();
        inlandFactory.createInlandPay(AppleInlandPay.class).inlandPay();
        inlandFactory.createInlandPay(HuaweiInlandPay.class).inlandPay();

        OutlandPayFactory outlandPayFactory = new OutlandPayFactory();
        outlandPayFactory.createOutlandPay(HuaweiOutlandPay.class).outlandPay();
        outlandPayFactory.createOutlandPay(MiOutlandPay.class).outlandPay();
    }
}
