import java.util.Scanner;

public class simpleinterest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("calculator the simple interest");
        System.out.print("enter the value of pricinple: ");
        int pricinple=sc.nextInt();
        System.out.println("enter the value of time: ");
        float time=sc.nextFloat();
        System.out.println("enter the value of rate: ");
        float rate=sc.nextFloat();
        float interest=pricinple* rate*time/100;

        System.out.println("the simple interest is: "+interest);


    }
}
