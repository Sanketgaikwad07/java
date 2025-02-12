import java.util.Scanner;

class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to the GCD\n");
        System.out.print("pease enter the your number: ");
        int first = sc.nextInt();
        System.out.print("enter the second number: ");
        int second = sc.nextInt();
        int sum = greatestCommonDivisor(first, second);
        System.out.println("GCD number is: " + sum);


    }


    public static int greatestCommonDivisor(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = laest(num1, num2);


        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;


    }


    public static int laest(int num1, int num2) {

        if (num1 < num2) {
            return num1;

        } else {
            return num2;

        }


    }
}

