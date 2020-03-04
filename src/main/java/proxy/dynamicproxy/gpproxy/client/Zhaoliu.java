package proxy.dynamicproxy.gpproxy.client;


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

    @Override
    public void match(Integer i) {
        if (i == 1) {
            System.out.println("你是我的公主");
        } else {
            System.out.println("滚粗!!!");
        }
    }
}
