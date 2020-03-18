package strategy.couponCourse;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 20:29
 */
public class CashbackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现");
    }
}
