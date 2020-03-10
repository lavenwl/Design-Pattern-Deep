package composite.transparentcomposite;

public class Test {
    public static void main(String[] args) {
        System.out.println("================透明组合模式写法===================");
        CourseComponent java8se = new Course("Java入门", 8280);
        CourseComponent ai = new Course("人工智能", 5000);

        CourseComponent packageCourse = new CoursePackage("Java架构师课程", 2);

        CourseComponent design = new Course("java设计模式", 1500);
        CourseComponent source = new Course("源码分析", 2000);
        CourseComponent softskill = new Course("软技能", 3000);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softskill);

        CoursePackage catalog = new CoursePackage("课程目录", 1);
        catalog.addChild(java8se);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);

        catalog.print();
    }
}
