package iterator.course;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-15 20:20
 */
public class Course {
    public Course(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
