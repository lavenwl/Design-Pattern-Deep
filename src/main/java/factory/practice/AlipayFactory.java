package factory.practice;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-25 19:12
 */
public class AlipayFactory extends PayFactory {
    @Override
    protected IChinaPay getChinaPay() {
        return new AlipayChina();
    }

    @Override
    protected IInternationalPay getInternationalPay() {
        return new AlipayInternational();
    }
}
