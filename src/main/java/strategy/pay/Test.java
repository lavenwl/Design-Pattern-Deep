package strategy.pay;

public class Test {


    public static void main(String[] args) {
        Order order = new Order("1", "1231231231", 3204);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
