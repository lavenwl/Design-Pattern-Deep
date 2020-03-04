package proxy.dynamicproxy.gpproxy.client;


import proxy.dynamicproxy.IPerson;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:43
 */
public class Test {
    public static void main(String[] args) {
        try {
            IPerson obj = (IPerson) new Meipo().getInstance(new Zhangsan());
            System.out.println(obj.getClass());
            obj.findLove();
            obj.match(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
