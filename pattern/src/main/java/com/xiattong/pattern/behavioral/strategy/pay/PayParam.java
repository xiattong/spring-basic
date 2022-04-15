package com.xiattong.pattern.behavioral.strategy.pay;

import lombok.Data;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/1/14 20:39
 * @modified By：
 */
@Data
public class PayParam {
    private String uid;
    private String orderId;
    private double amount;

    public PayParam(){}

    public PayParam(String uid,String orderId,double amount){
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }
}
