package template.course;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 16:24
 */
public class JavaCourse extends AbstractCourse {

    private boolean needCheckHomework = false;

    public boolean isNeedCheckHomework() {
        return needCheckHomework;
    }

    public void setNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查JAVA作业");
    }

    @Override
    protected boolean needCheckHomework() {
        return needCheckHomework;
    }
}
