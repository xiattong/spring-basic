package com.xiattong.pattern.behavioral.strategy.promotion;

/**
 * Created by Tom.
 */
public class EmptyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
