package strategy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 20:29
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
