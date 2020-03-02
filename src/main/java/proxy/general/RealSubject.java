package proxy.general;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:22
 */
public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("Real service is called");
    }
}
