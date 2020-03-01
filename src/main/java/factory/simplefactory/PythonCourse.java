package factory.simplefactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 20:45
 */
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("this is a Python course");
    }
}
