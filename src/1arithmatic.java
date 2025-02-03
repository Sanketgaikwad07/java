import java.util.Scanner;

 class arithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your first number: ");
        int first = sc.nextInt();
        System.out.print("please enyer your second number: ");
        int second = sc.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;

        System.out.println("Addition is: " + add);
        System.out.println("subtraction is: " + sub);
        System.out.println("multiplication is: " + mul);
        System.out.println("division is: " + div);


    }
}
