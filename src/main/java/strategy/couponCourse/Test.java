package strategy.couponCourse;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 20:30
 */
public class Test {
    public static void main(String[] args) {
        PromotionStrategyFactory.getPromotionkeys();
        String promotionKey = "COUPON";

        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
