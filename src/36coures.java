

class Course {
    static int maxCapacity = 100;


    String Coursename;

    int Enrollmaent;
    String[] enrollmentstudent;


    Course(String coursename) {
        this.Coursename = coursename;
        this.Enrollmaent = 0;
        this.enrollmentstudent = new String[maxCapacity];

    }

    // String[] enrollmentstudent=new String[maxCapacity];
    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;

    }

    void setEnrollmaent(String studentName) {
        enrollmentstudent[Enrollmaent] = studentName;
        Enrollmaent++;

    }

    void Unenrollment(String studentName) {
        System.out.println("Student removed");
        Enrollmaent--;
        System.out.println();


    }


}
