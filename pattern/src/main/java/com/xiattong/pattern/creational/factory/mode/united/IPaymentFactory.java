package com.xiattong.pattern.creational.factory.mode.united;

import com.xiattong.pattern.creational.factory.mode.IInlandPay;
import com.xiattong.pattern.creational.factory.mode.IOutlandPay;

/**
 * 定义一个支付产品工厂接口
 * 规定产出的产品应具备境内支付、境外支付功能
 * @Author: xiattong
 * @Date: 2020/2/25 14:10
 */
public interface IPaymentFactory {

    IInlandPay createInlandPay();

    IOutlandPay createOutlandPay();

}
