package singleton.lazy;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-26 21:34
 *
 * 静态内部类单
 *
 * 优点：写法简单优雅， 利用了java本身语法特点
 *
 * 缺点：能够被反射破坏 -> 构造器添加异常不优雅
 *
 */
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton() {
        if (LazyHolder.LAZY_STATIC_INNER_CLASS_SINGLETON != null) {
            throw new RuntimeException("不允许非法访问");
        }
    };

    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.LAZY_STATIC_INNER_CLASS_SINGLETON;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton LAZY_STATIC_INNER_CLASS_SINGLETON = new LazyStaticInnerClassSingleton();
    }
}
