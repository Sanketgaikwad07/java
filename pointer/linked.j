import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class SubjectNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> subjects = new LinkedList<>();

        System.out.print("Enter the number of subjects (N): ");
        int n = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("Enter " + n + " subject names:");
        for (int i = 0; i < n; i++) {
            String subject = scanner.nextLine();
            subjects.add(subject);
        }

        System.out.println("Subject Names:");
        Iterator<String> iterator = subjects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}
