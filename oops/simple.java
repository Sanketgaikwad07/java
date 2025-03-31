// Define a class 'Person'
class Person {
    String name;
    int age;

    // Constructor to initialize Person objects
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Array Example: Storing multiple numbers and printing them
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + i + ": " + numbers[i]);
        }

        // Method call: Calling a method to sum two numbers
        int result = sum(5, 10);
        System.out.println("Sum of 5 and 10 is: " + result);

        // Object-oriented example: Create a Person object and display details
        Person person1 = new Person("Alice", 25);
        person1.displayDetails();
    }

    // Method to calculate sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }
}
