import java.util.Scanner;

class leastCommoMultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the LCM\n");
        System.out.print("please enter the number:  ");

        int first = sc.nextInt();
        System.out.print("enter the second number: ");
        int second = sc.nextInt();


        int sum = leastCommoMultiple(first, second);


        System.out.println("LCM is" + sum);


    }

    public static int leastCommoMultiple(int first, int second) {
        int i = 1;

        //while (i <= second) {
        while (true) {

            int factor = first * i;
            if (factor % second == 0) {

                return factor;
            }
            i++;
        }
        // return 0;//unreachable point


    }


}


