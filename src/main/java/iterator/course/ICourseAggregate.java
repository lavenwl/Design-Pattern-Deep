package iterator.course;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-15 20:21
 */
public interface ICourseAggregate {
    void add(Course course);
    void remove(Course course);

    Iterator<Course> iterator();
}
