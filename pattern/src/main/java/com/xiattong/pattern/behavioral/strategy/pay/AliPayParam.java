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
public class AliPayParam extends PayParam{
    private String remark = "Hello Alibaba";

    public AliPayParam(String uid,String orderId,double amount,String remark){
        super(uid, orderId, amount);
        this.remark = remark;
    }
}
