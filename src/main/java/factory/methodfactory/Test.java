package factory.methodfactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 21:08
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
    }
}
