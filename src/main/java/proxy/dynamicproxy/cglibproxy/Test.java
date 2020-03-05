package proxy.dynamicproxy.cglibproxy;

public class Test {
    public static void main(String[] args) throws Exception {
        Customer c = (Customer) new Meipo().getInstance(Customer.class);
        c.findLove();
    }
}
