package factory.practice;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-25 19:02
 */
public class WechatPayChina implements IChinaPay {
    @Override
    public void chinaPay() {
        System.out.println("WechatPay in China");
    }
}
