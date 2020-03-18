package strategy.pay;

public abstract class Payment {
    
    public abstract String getName();
    
    public MsgResult pay(String uid, double amount) {
        // 判断余额是否足够
        if (queryBalance(uid) < amount) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额" + amount);
    }

    protected abstract double queryBalance(String uid);

}
