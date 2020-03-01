package factory.simplefactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 20:56
 */
public class Test {
    /**
     * 比较适合创建简单的几个对象，
     *
     * 违背了单一职责原则， 后面新增产品，
     * 需要修改工厂类， 违背了开闭原则
     */
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse javaCourse = factory.create(JavaCourse.class);
        ICourse pythonCourse = factory.create(PythonCourse.class);
        System.out.println(123);
    }
}
