package com.xiattong.pattern.behavioral.state.order;

/**
 * 订单状态
 */
public enum OrderStatus {
    // 待支付，（支付），待发货，（发货），待收货，（确认收货），订单结束
    WAIT_PAYMENT, WAIT_DELIVER, WAIT_RECEIVE, FINISH;
}