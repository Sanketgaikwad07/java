import java.util.Scanner;

class absolute {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = sc.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("your absolute value is:" + result);

    }


}
