package strategy.couponCourse;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 20:28
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("优惠券");
    }
}
