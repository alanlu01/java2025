package ntou.cs.java2025;
import java.util.ArrayList;

public class CourseManager {
    private static final ArrayList<Course> courses = new ArrayList<>();

    public static void addCourse(Course course) {
        if (course == null) {
            return;
        }
        
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println("Course " + course.getCourseName() + " successfully added");
        } else {
            System.out.println("Course " + course.getCourseName() + " already exists");
        }
    }

    public static Course findCourse(String courseName) {
        if (courseName != null) {
            for (Course course : courses) {
                if (course.getCourseName().equals(courseName)) {
                    return course;
                }
            }
        }
        return null;
    }

    public static void printAllCoursesInfo() {
        System.out.println("\nCourses Information:");
        for (Course course : courses) {
            System.out.println(course.toString());
        }
    }
}
