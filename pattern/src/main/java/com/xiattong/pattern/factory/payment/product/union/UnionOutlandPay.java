package com.xiattong.pattern.factory.payment.product.union;

import com.xiattong.pattern.factory.payment.mode.IOutlandPay;

/**
 * 银联的境外支付类，实现境外支付接口
 * @Author: xiattong
 * @Date: 2020/2/25 14:17
 */
public class UnionOutlandPay implements IOutlandPay {

    /** 银联境外支付*/
    public void outlandPay() {
        System.out.println("这是Union的境外支付方法！");
    }
}
