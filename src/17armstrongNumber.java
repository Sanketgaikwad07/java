import java.util.Scanner;

class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the Armstromg Number\n");
        System.out.println("please enter number: ");

        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);

        if (isArmstrong) {
            System.out.println("your number");
        } else {
            System.out.println("your number is  not armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int Digit = noOfDigit(num);
        int newCopy = num;
        System.out.println("no of digit" + Digit);
        int finalNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            finalNumber += pow(digit, Digit);
        }


        return finalNumber == newCopy;
    }

    public static int pow(int num1, int num2) {

        int result = num1;
        int i = 1;
        while (i < num2) {
            result *= num1;
            i++;

        }

        return result;
    }

    public static int noOfDigit(int num) {
        int digit = 0;

        while (num > 0) {
            digit++;
            num /= 10;
        }


        return digit;
    }


}
