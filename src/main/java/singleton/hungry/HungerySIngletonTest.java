package singleton.hungry;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 09:48
 */
public class HungerySIngletonTest {
    public static void main(String[] args) {
        System.out.println(HungrySingleton.getInstance() == HungrySingleton.getInstance());

        // 测试多线程的情况

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(HungrySingleton.getInstance());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(HungrySingleton.getInstance());
            }
        }).start();
    }
}
