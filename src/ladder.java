import java.util.Scanner;

public class ladder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n>100){
            System.out.println("small");
        }else if
            (n>=100&&n<=200){
            System.out.println("large");
        }else if (n>201&&n<=300){
            System.out.println("bigger");
        } else if (n>301&&n<=400) {
            System.out.println("largest");

        }else{
            System.out.println("very out of thr large");
        }
    }
}

