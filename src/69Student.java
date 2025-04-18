class Student {
    int noOfStudent;

    int subject;
    int pass;
    String name;
    String roll; // lowercase 'roll' to match Java naming conventions
    String marks;// lowercase 'marks'

    public Student(int noOfStudent, int subject, String name, String roll, String marks) {
        this.noOfStudent = noOfStudent;
        this.marks = marks;
        this.name = name;
        this.pass = pass;
        this.subject = subject;
        this.roll = roll;
    }

    public static void main(String[] args) {
        Student Sanket = new Student(19, 5, "90", "SANKET", "2404");
        System.out.println(Sanket);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("marks='").append(marks).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", noOfStudent=").append(noOfStudent);
        sb.append(", pass=").append(pass);
        sb.append(", roll='").append(roll).append('\'');
        sb.append(", subject=").append(subject);
        sb.append('}');
        return sb.toString();
    }

    ;


}





