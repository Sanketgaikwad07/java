public class Main {
    public static void main(String[] args) {
        // Print a greeting message
        System.out.println("Hello, world!");

        // For loop example: printing numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // While loop example: printing even numbers from 2 to 10
        int number = 2;
        while (number <= 10) {
            System.out.println("Even Number: " + number);
            number += 2; // Increment by 2
        }

        // Conditional Example
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
