package strategy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 20:29
 */
public class GroupbyStrategy implements IPromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("团购");
    }
}
