package builder.simple;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-29 21:25
 */
public class CourseBuilder {
    private Course course = new Course();

    public void addName(String name) { course.setName(name);}
    public void addPpt(String ppt) { course.setName(ppt);}
    public void addVideo(String video) { course.setName(video);}
    public void addNote(String note) { course.setName(note);}
    public void addHomework(String homework) { course.setName(homework);}

    public Course builer() {
        return course;
    }
}
