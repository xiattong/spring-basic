package com.xiattong.pattern.behavioral.strategy.promotion;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        String promotionKey = "COUPON";

        IPromotionStrategy promotionStrategy = PromotionStrategyFacory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
