package factory.practice;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-25 18:57
 */
public abstract class PayFactory {
    public PayFactory() {
        this.init();
    }

    private void init() {
        System.out.println("初始化支付环境");
    }

    protected abstract IChinaPay getChinaPay();

    protected abstract IInternationalPay getInternationalPay();
}
