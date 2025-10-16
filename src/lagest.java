import java.util.Scanner;

public class lagest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a_1=sc.nextInt();

        System.out.println("enter the second int");
        int a_2=sc.nextInt();

        System.out.println("Enter the third int");
        int a_3=sc.nextInt();

        if(a_1>a_2&&a_1>a_3){
            System.out.println("number is lager");
        } else if (a_2>a_1&&a_2>a_3) {
            System.out.println("the number laeest" );


        }else{
            System.out.println(a_3+"the number is lagest");
        }if (a_1==a_2||a_2==a_3){
            System.out.println("Invalid number");
        }
    }
}
