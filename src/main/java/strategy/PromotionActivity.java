package strategy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 20:31
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.doPromotion();
    }
}
