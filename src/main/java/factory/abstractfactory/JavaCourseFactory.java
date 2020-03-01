package factory.abstractfactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 21:28
 */
public class JavaCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();

    }
}
