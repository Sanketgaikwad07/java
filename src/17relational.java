import java.util.Scanner;

class relational {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);


         System.out.println("welcome to driving class\n");
         System.out.println("please enter your age: ");
         int age=sc.nextInt();

         if(age>=17) {
             System.out.println("yor are ready to drive");
         }
         else {
             System.out.println("baache tu gotya he cholu");

         }


     }
}
