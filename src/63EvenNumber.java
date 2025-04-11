import java.util.Scanner;

class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = sc.nextInt();

        System.out.println("Even numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.println(i);
        }

        //scanner.close();
    }
}
