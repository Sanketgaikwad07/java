import java.util.Scanner;

class oddsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome in oddeven world\n");
        System.out.print("enter the first number:  ");


        int num = sc.nextInt();
        int sum = addsum(num);
        System.out.println("addsum till" + num + "is:" + sum);


    }

    public static int addsum(int num) {
        int sum = 0;
        int i = 1;

        while (i <= num) {
            sum += i;
            i += 2;

        }

        return sum;
    }
}




