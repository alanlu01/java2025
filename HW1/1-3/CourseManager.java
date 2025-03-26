import java.util.ArrayList;

public class CourseManager {
    private static final ArrayList<Course> courses = new ArrayList<>();

    public static void addCourse(Course course) {
        // TODO
    }

    public static Course findCourse(String courseName) {
        // TODO
    }

    public static void printAllCoursesInfo() {
        System.out.println("\nCourses Information:");
        for (Course course : courses) {
            System.out.println(course.toString());
        }
    }
}
