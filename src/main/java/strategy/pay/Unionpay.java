package strategy.pay;

public class Unionpay extends Payment {
    @Override
    public String getName() {
        return "银联";
    }

    @Override
    protected double queryBalance(String uid) {
        return 90;
    }
}
