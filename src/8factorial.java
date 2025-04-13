import java.util.Scanner;

class factor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the factorial\n");

        System.out.print("enter the number:  ");

        int num = sc.nextInt();
        long fact = factorial(num);

        System.out.println("factorial: " + fact);


    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;

        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;

    }


}
