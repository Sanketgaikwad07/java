import java.util.Scanner;

public class ev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number number : ");
        int num = sc.nextInt();
        int[] number = new int[num];
//        System.out.println(num + "  number");
//        for (int i = 0; i < num; i++) {
//            number[i] =sc.nextInt(); }
//        System.out.println(" result");
        for (int i=0;i<num;i++){
            if(number[i]%2==0) {
                System.out.println(number[i] + "even");
            }else {
                System.out.println(number[i] + "odd");
            }

            }
        }
    }
