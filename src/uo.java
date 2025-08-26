public class  uo {
    private String name;
    private String studentId;


    public static void main(String[] args) {
         uo s = new  uo();
        s.setName("Sanket Gaikwad");
        s.setStudentId("STU123");

        s.printAllAttributes();
        System.out.println("Formatted Name: " + s.getName());
    }

    private void printAllAttributes() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    static class student {
        private String name;
        private String studentId;

        public String getName() {
            if (name != null && name.contains(" ")) {
                String[] parts = name.split(" ");
                String firstInitial = parts[0].substring(0, 1);
                String lastName = parts[1];
                return firstInitial + " " + lastName;
            }
            return name;
        }

        public void setName(String newName) {
            this.name = newName;
        }

        public void setStudentId(String newId) {
            this.studentId = newId;
        }

        public void printAllAttributes() {
            System.out.println("Name: " + name);
            System.out.println("Student ID: " + studentId);

        }
    }
}
