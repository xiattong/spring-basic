package com.xiattong.pattern.behavioral.strategy.pay;

import com.xiattong.pattern.behavioral.strategy.pay.payport.PayStrategy;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","2020031401000323",324.5);
        MsgResult result = order.pay(PayStrategy.ALI_PAY);
        System.out.println(result);
    }
}
