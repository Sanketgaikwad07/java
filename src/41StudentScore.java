import java.util.Scanner;

class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        String catgory = marks > 80 ? "high" : (marks > 50 ? "maderate" : "low");
        System.out.println("your catgory is: " + catgory);
    }


}
