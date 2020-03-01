package factory.abstractfactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 21:24
 */
public abstract class CourseFactory {

    public void init() {
        System.out.println("初始化基础数据");
    }

    protected  abstract  INote createNote();

    protected abstract  IVideo createVideo();
}
