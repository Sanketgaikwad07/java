import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name=sc.nextLine();



        System.out.print("your age is : ");
        int age=sc.nextInt();
      //  System.out.print("print: "+name+ " your age: "+age+"\n");

        System.out.println("next year age is: "+ (age+2/3));

        //System.out.println("Your next year age is : "+age+1);
    }
}
