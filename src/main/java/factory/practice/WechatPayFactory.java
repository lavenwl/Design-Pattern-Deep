package factory.practice;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-25 19:11
 */
public class WechatPayFactory extends PayFactory {
    @Override
    protected IChinaPay getChinaPay() {
        return new WechatPayChina();
    }

    @Override
    protected IInternationalPay getInternationalPay() {
        return new WechatInternationalPay();
    }
}
