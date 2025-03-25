// Student Class
class Student {
    String name;
    int rollNumber;
    String[] enrolledCourses = new String[5];  // Can enroll in up to 5 courses
    int courseCount = 0;

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to enroll in a course
    public void enrollInCourse(String courseName) {
        if (courseCount < 5) {
            enrolledCourses[courseCount] = courseName;
            courseCount++;
            System.out.println(name + " has successfully enrolled in " + courseName);
        } else {
            System.out.println(name + " cannot enroll in more than 5 courses.");
        }
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Enrolled Courses: ");
        if (courseCount == 0) {
            System.out.println("No courses enrolled.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.print(enrolledCourses[i] + " ");
            }
            System.out.println();
        }
    }
}

// Course Class
class Course {
    String courseName;
    int courseCode;

    // Constructor
    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Method to display course details
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

// Main Class
public class CollegeSystem {
    public static void main(String[] args) {
        // Creating Students
        Student student1 = new Student("John Doe", 101);
        Student student2 = new Student("Jane Smith", 102);

        // Creating Courses
        Course course1 = new Course("Java Programming", 201);
        Course course2 = new Course("Data Structures", 202);
        Course course3 = new Course("Algorithms", 203);

        // Enrolling students in courses
        student1.enrollInCourse(course1.courseName);
        student1.enrollInCourse(course2.courseName);
        
        student2.enrollInCourse(course2.courseName);
        student2.enrollInCourse(course3.courseName);

        // Displaying student information
        System.out.println("\nStudent 1 Info:");
        student1.displayStudentInfo();
        
        System.out.println("\nStudent 2 Info:");
        student2.displayStudentInfo();
        
        // Displaying course information
        System.out.println("\nCourse Info:");
        course1.displayCourseInfo();
        course2.displayCourseInfo();
        course3.displayCourseInfo();
    }
}
