import java.util.LinkedList;
import java.util.Scanner;

public class NegativeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.print("Enter the number of integers (N): ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("Negative Integers:");
        for (int number : numbers) {
            if (number < 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
