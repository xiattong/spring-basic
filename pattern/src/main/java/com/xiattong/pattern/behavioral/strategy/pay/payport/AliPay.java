package com.xiattong.pattern.behavioral.strategy.pay.payport;

import com.xiattong.pattern.behavioral.strategy.pay.AliPayParam;
import com.xiattong.pattern.behavioral.strategy.pay.MsgResult;
import com.xiattong.pattern.behavioral.strategy.pay.PayParam;

import java.util.Map;

/**
 * Created by Tom.
 */
public class AliPay extends Payment {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }

    //通用逻辑放到抽象类里面实现
    @Override
    public MsgResult pay(Map<String,Object> paramMap){
        //余额是否足够
        if(queryBalance(paramMap.get("uid").toString()) < (double)paramMap.get("amount")){
            return new MsgResult(500,"支付失败","This alipay   " + paramMap.get("remark"));
        }
        return new MsgResult(200,"支付成功","This alipay   " + paramMap.get("remark"));
    }
}
