package factory.practice;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-25 19:09
 */
public class WechatInternationalPay implements IInternationalPay {
    @Override
    public void internationalPay() {
        System.out.println("WechatPay in International");
    }
}
