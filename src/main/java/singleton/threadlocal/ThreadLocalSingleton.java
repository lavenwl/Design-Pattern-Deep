package singleton.threadlocal;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-26 22:30
 *
 * 特殊性:
 *
 */
// 这里还不是很明白
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLoaclInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                protected ThreadLocalSingleton initValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {
        return threadLoaclInstance.get();
    }
}
