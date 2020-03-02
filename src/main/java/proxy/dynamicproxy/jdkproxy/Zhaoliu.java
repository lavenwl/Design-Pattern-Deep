package proxy.dynamicproxy.jdkproxy;


import proxy.dynamicproxy.IPerson;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:37
 */
public class Zhaoliu implements IPerson {

    @Override
    public void findLove() {
        System.out.println("赵六找媳妇");
    }

    @Override
    public void buyInsure() {
        System.out.println("赵六买保险");
    }
}
