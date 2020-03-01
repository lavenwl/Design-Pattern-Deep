package factory.abstractfactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 21:29
 */
public class PythonCourseFactory extends CourseFactory {

    @Override
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
