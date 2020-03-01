package proxy.staticproxy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:30
 */
public class Test {
    public static void main(String[] args) {
        Zhangsan son = new Zhangsan();
        Zhanglaosan father = new Zhanglaosan(son);
        father.findLove();
    }
}
