package factory.practice;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-25 19:10
 */
public class AlipayInternational implements IInternationalPay {
    @Override
    public void internationalPay() {
        System.out.println("Alipay in International");
    }
}
