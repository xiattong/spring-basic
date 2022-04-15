package com.xiattong.pattern.behavioral.strategy.pay.payport;

import com.xiattong.pattern.behavioral.strategy.pay.MsgResult;
import com.xiattong.pattern.behavioral.strategy.pay.PayParam;

import java.util.Map;

/**
 * Created by Tom.
 */
public abstract class Payment {

    public abstract String getName();

    //通用逻辑放到抽象类里面实现
    public MsgResult pay(Map<String,Object> paramMap){
        //余额是否足够
        if(queryBalance(paramMap.get("uid").toString()) < (double)paramMap.get("amount")){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额" + paramMap.get("amount"));
    }

    protected abstract double queryBalance(String uid);
}
