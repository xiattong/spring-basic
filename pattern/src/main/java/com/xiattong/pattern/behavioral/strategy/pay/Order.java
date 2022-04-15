package com.xiattong.pattern.behavioral.strategy.pay;

import com.xiattong.pattern.behavioral.strategy.pay.payport.PayStrategy;
import com.xiattong.pattern.behavioral.strategy.pay.payport.Payment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tom.
 */
public class Order {

    private Map<String,Object> payParam = new HashMap<>();


    public Order(String uid, String orderId, double amount) {
        payParam.put("uid",uid);
        payParam.put("orderId",orderId);
        payParam.put("amount",amount);
    }

    public MsgResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为" + payParam.get("amount") + "，开始扣款");
        return payment.pay(payParam);
    }
}
