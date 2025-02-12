import java.util.Scanner;

class fibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the ficonacci serires\n");
        System.out.print("please enter the number upto which series has to be printed:  ");

        int first = sc.nextInt();
        printfibonacci(first);
        System.out.println("your fibonacco series here");


    }

    public static void printfibonacci(int first) {
        if (first < 0) return;
        System.out.println("0 ");

        if (first == 0)
            return;
        System.out.println("1");


        int num = 0, num2 = 1;
        while (num + num2 <= first) {

            int third = num + num2;
            System.out.println(third + "");
            num = num2;
            num2 = third;

        }

    }

}
