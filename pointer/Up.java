import java.util.Scanner;

public class UpProgram {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello, World!");

        // Creating a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive (up) or not
        if (number > 0) {
            System.out.println("The number is positive (up).");
        } else if (number < 0) {
            System.out.println("The number is negative (down).");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
