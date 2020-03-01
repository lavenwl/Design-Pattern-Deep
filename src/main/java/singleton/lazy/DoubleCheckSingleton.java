package singleton.lazy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-26 21:13
 *
 * 优点： 性能提高了， 线程安全了
 * 缺点：程序可读性差，不优雅。
 *
 */
public class DoubleCheckSingleton {
    private volatile static  DoubleCheckSingleton instance;
    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton GetInstance() {
        // 是否要阻塞
        if (instance == null) {
            synchronized(DoubleCheckSingleton.class) {
                // 是否需要创建实例
                if (instance == null) {
                    // 存在指令重排序问题（volatile）
                    instance = new DoubleCheckSingleton();
                }
                return instance;
            }
        }
        return instance;


    }

}
