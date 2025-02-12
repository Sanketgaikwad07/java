import java.util.Scanner;

class Return {
    public static void main(String[] args) {

        grest();

        int first = number();
        int second = number() + 8;

        int sum = first + second;
        System.out.println("sum of the number" + sum);

    }

    public static int number() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int first = sc.nextInt();

        return first;
    }

    public static void grest() {

        System.out.println("welcome the /n");


    }

}
