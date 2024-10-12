import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers to sum (negative number to stop):");

        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }

        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
