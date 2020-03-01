package factory.methodfactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 21:07
 */
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
