package singleton.hungry;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-26 20:43
 */
public class HungryStaticSingleton {
    public static final HungryStaticSingleton HUNGRY_STATIC_SINGLETON;

    static {
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}
}
