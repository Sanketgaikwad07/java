import java.util.Scanner;

class even {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("please enter the  number:");
     int num= sc.nextInt();
     String result=num%2==0 ?"even":"odd";
         System.out.println("you number is: "+result);


     }






}
