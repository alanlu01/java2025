import java.util.ArrayList;

public class Course {
    private final String courseName;
    private final ArrayList<Student> studentList;
    private final int maxStudents;

    public Course(String courseName, int maxStudents) {
        // TODO
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void addStudent(Student student) {
        // TODO
    }

    public void removeStudent(Student student) {
        // TODO
    }

    @Override
    public String toString() {
        String result = "Course: " + courseName + "\n";
        result += "Maximum Students: " + maxStudents + "\n";
        result += "Students Enrolled:\n";

        for (Student student : studentList) {
            result += "- " + student.getName() + "\n";
        }

        return result;
    }
}