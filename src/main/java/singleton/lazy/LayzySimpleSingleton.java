package singleton.lazy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-26 20:46
 *
 * 懒汉式单例
 *
 * 优点：节省空间
 *
 * 缺点：并发问题
 *
 * 1. 添加synchronized关键字 -> 导致性能低的问题
 *
 */
public class LayzySimpleSingleton {
    private static LayzySimpleSingleton instance;

    private LayzySimpleSingleton(){}

    public synchronized static LayzySimpleSingleton GetInstance() {
        if (instance == null) {
            instance = new LayzySimpleSingleton();
        }
        return instance;
    }
}
