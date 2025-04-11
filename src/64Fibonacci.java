import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the fiboancci\n");
        System.out.print("Enter your number number: ");
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println(isFib(i) + " ");
        }
    }

    public static int isFib(int position) {
        System.out.print(". ");
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return isFib(position - 1) + isFib(position - 2);
    }
}
