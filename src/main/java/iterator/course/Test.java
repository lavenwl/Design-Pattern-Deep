package iterator.course;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-15 20:27
 */
public class Test {
    public static void main(String[] args) {
        Course java = new Course("java");
        Course python = new Course("python");
        Course design = new Course("design");
        Course ai = new Course("ai");

        ICourseAggregate aggregate = new CourseAggregateImpl();
        aggregate.add(java);
        aggregate.add(python);
        aggregate.add(design);
        aggregate.add(ai);

        System.out.println("====课程表====");
        printCourse(aggregate);
    }

    private static void printCourse(ICourseAggregate aggregate) {
        Iterator<Course> i = aggregate.iterator();
        while(i.hasNext()) {
            Course course = i.next();
            System.out.println(course.getName());
        }
    }
}
