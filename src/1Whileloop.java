import java.util.Scanner;

class whileLoop {
    public static void main(String[] args) {
        int num = 3;//initialation
        while (num <= 50) {//  condition

            {
                System.out.println(num);//actual work
                num = num + 3;//updating the condition


                int count = 500;
                while (count >= 200) {
                    System.out.println(count);
                    count -= 1;

                }

                Scanner sc = new Scanner(System.in);
                int i = 0;
                while (i < 5) {
                    int np = sc.nextInt();
                    System.out.println("number is: " + np);
                    i++;

                }
            }
        }
    }
}



