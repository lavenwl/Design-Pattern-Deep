package proxy.general;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:21
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
