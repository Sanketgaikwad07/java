import java.util.Scanner;

class reverseDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the reverse Digit\n");
        System.out.print("enter the number:  ");

        int num = sc.nextInt();
        int reverse = reverse(num);
        System.out.println("reverse the number: " + reverse);

    }

    public static int reverse(int num) {

        int newnum = 0;
        while (num > 0) {
            int digit = num % 10;
            newnum = newnum * 10 + digit;

            num /= 10;
        }


        return newnum;

    }


}
