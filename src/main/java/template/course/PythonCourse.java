package template.course;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 16:31
 */
public class PythonCourse extends AbstractCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查python作业");
    }

    @Override
    protected boolean needCheckHomework() {
        return false;
    }
}
