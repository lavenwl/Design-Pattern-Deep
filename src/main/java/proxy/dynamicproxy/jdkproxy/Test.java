package proxy.dynamicproxy.jdkproxy;

import proxy.staticproxy.IPerson;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:43
 */
public class Test {
    public static void main(String[] args) {
        Meipo meipo = new Meipo();
        IPerson zhangsan = meipo.getInstance(new Zhangsan());
        zhangsan.findLove();

        IPerson zhangsan = meipo.getInstance(new Zhaoliu());
        zhangsan.findLove();

    }
}
