package strategy.pay;

public class Wechatpay extends Payment {
    @Override
    public String getName() {
        return "微信";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
