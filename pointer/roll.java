// Student Class
class Student {
    String name;
    int rollNumber;
    String[] enrolledCourses = new String[5];  // Can enroll in up to 5 courses
    int courseCount = 0;
    double[] grades = new double[5];  // Store grades for each enrolled course

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to enroll in a course
    public boolean enrollInCourse(Course course) {
        if (courseCount < 5 && course.addStudent(this)) {
            enrolledCourses[courseCount] = course.getCourseName();
            grades[courseCount] = -1;  // Assign a default grade of -1 (not graded yet)
            courseCount++;
            return true;
        }
        return false;
    }

    // Method to assign grade to a course
    public void assignGrade(String courseName, double grade) {
        for (int i = 0; i < courseCount; i++) {
            if (enrolledCourses[i].equals(courseName)) {
                grades[i] = grade;
                System.out.println("Grade " + grade + " has been assigned to " + name + " for " + courseName);
                return;
            }
        }
        System.out.println(name + " is not enrolled in " + courseName);
    }

    // Method to display student
