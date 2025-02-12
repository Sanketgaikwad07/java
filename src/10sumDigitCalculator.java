import java.util.Scanner;

class sumDigitCalculator {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to sum digit\n");
        System.out.print("enter he number:");

        int num = sc.nextInt();
        int sum = sumDigitCalculator(num);

        System.out.println("sum of digit " + sum);


    }

    public static int sumDigitCalculator(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;

            num /= 10;


        }


        return sum;


    }

}
