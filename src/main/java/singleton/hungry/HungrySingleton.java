package singleton.hungry;

import java.io.Serializable;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-26 20:37
 */
public class HungrySingleton implements Serializable {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    private Object readResolve() {
        return HUNGRY_SINGLETON;
    }
}
