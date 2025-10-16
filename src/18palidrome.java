import java.util.Scanner;

class palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the palidrome\n");
        System.out.print("Enter the number: ");

        int first = sc.nextInt();

        boolean ispalindrome = ispalidrome(first);

        if (ispalindrome) {
            System.out.println("your number is palidrome");
        } else {
            System.out.println("your number is not palidrome");
        }
    }

    public static boolean ispalidrome(int first) {

        return first == reverse(first);


    }

    public static int reverse(int first) {

        int newNum = 0;
        while (first > 0) {
            int digit = first % 10;
            newNum = newNum * 10 + digit;

            first /= 10;
        }
        return newNum;

    }
}
