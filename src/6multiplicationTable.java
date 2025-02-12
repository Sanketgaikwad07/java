import java.util.Scanner;

class multiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to multiplication");
        System.out.print("enter the your number:  ");
        int num = sc.nextInt();
        printmultiplicaton(num);


    }

    public static void printmultiplicaton(int num) {
        int i = 0;

        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + (num * i));

            i++;

        }

    }


}
