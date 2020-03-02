package proxy.dynamicproxy.jdkproxy;


import proxy.dynamicproxy.IPerson;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:27
 */
public class Zhangsan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
    }

    @Override
    public void buyInsure() {
        System.out.println("这里买保险");
    }
}
