package factory.abstractfactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 20:44
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("this is a Java course");
    }
}
