package com.xiattong.pattern.creational.factory.product;

import com.xiattong.pattern.creational.factory.product.alipay.AliPayFactory;
import com.xiattong.pattern.creational.factory.product.union.UnionPayFactory;
import com.xiattong.pattern.creational.factory.product.wechat.WeChatPayFactory;

/**
 * @Author: xiattong
 * @Date: 2020/2/25 14:34
 */
public class Test {
    public static void main(String[] args) {
        /**阿里支付实现*/
        AliPayFactory aliPayFactory = new AliPayFactory();
        aliPayFactory.createInlandPay().inlandPay();
        aliPayFactory.createOutlandPay().outlandPay();

        /**微信支付实现*/
        WeChatPayFactory wechatPayFactory = new  WeChatPayFactory();
        wechatPayFactory.createInlandPay().inlandPay();
        wechatPayFactory.createOutlandPay().outlandPay();

        /**银联支付实现*/
        UnionPayFactory unionPayFactory = new UnionPayFactory();
        unionPayFactory.createInlandPay().inlandPay();
        unionPayFactory.createOutlandPay().outlandPay();
    }
}
