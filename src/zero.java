import java.util.Scanner;

public class zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int a=sc.nextInt();


        if(a>0){
            System.out.println("Number is"+a +"positive ");
        } else if (a<0) {
            System.out.println("number is" +a+"negative ");
            
        }else{
            System.out.println("the number is zero");
        }
    }
}
