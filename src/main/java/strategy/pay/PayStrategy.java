package strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public static final String ALI_PAY = "Alipay";
    public static final String WECHAT_PAY = "Wechatpay";
    public static final String UNION_PAY = "Unionpay";
    public static final String DEFAULT_PAY = "Alipay";

    private static Map<String, Payment> strategy = new HashMap<String, Payment>();

    static {
        strategy.put(ALI_PAY, new Alipay());
        strategy.put(WECHAT_PAY, new Wechatpay());
        strategy.put(UNION_PAY, new Unionpay());
    }

    public static Payment get(String payKey) {
        if (! strategy.containsKey(payKey)) {
            return strategy.get(DEFAULT_PAY);
        }
        return strategy.get(payKey);
    }


}
