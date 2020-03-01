package factory.abstractfactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 21:26
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("Java Video");
    }
}
