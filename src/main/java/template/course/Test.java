package template.course;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 16:32
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("====架构课程===");
        JavaCourse java = new JavaCourse();
        java.setNeedCheckHomework(true);
        java.createCourse();
    }
}
