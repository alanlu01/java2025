package ntou.cs.java2025;//01257117呂翰昇
import java.util.ArrayList;

public class Course {
    private final String courseName;
    private final ArrayList<Student> studentList;
    private final int maxStudents;

    public Course (String courseName, int maxStudents) {
        // 檢查課程名稱
        if (courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be null or empty");
        }
        this.courseName = courseName;
        
        // 檢查最大學生數
        if (maxStudents <= 0) {
            throw new IllegalArgumentException("Maximum students must be a positive integer");
        }
        this.maxStudents = maxStudents;
        
        this.studentList = new ArrayList<>();
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
        if (student == null) {
            return;
        }
        
        if (studentList.size() >= maxStudents) {
            System.out.println("Cannot add student " + student.getName() + ", course " + courseName + " has reached maximum capacity");
            return;
        }
        
        if (studentList.contains(student)) {
            System.out.println("Student " + student.getName() + " is already enrolled in course " + courseName);
            return;
        }
        
        studentList.add(student);
        System.out.println("Student " + student.getName() + " successfully added to course " + courseName);
    }

    public void removeStudent(Student student) {
        if (student == null) {
            return;
        }
        
        if (studentList.contains(student)) {
            studentList.remove(student);
            System.out.println("Student " + student.getName() + " successfully removed from course " + courseName);
        } else {
            System.out.println("Student " + student.getName() + " is not enrolled in course " + courseName);
        }
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