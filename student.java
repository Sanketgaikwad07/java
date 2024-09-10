public class Student {
    private String name;
    private String id;
    private double[] grades;

 
    public Student(String name, String id, double[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

   
    public String getName() {
        return name;
    }

 
    public String getId() {
        return id;
    }

   
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0;
    }

   
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        System.out.println("Average Grade: " + calculateAverage());
    }
}
