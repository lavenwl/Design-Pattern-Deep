package builder.chain;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-29 21:25
 */
public class CourseBuilder {
    private Course course = new Course();

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }
    public CourseBuilder addPpt(String ppt) {
        course.setName(ppt);
        return this;
    }
    public CourseBuilder addVideo(String video) {
        course.setName(video);
        return this;
    }
    public CourseBuilder addNote(String note) {
        course.setName(note);
        return this;
    }
    public CourseBuilder addHomework(String homework) {
        course.setName(homework);
        return this;
    }


    public Course builer() {
        return course;
    }
}
