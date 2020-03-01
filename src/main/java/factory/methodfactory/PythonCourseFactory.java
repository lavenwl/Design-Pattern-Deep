package factory.methodfactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 21:09
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
