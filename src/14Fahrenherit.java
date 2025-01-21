import java.util.Scanner;

class Fahrenherit {


     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the value of F:");
         float F=sc.nextFloat();
              Float cel=(F-32)*5/9;
         System.out.println("your temp is:  "+cel+"c");

     }
}
