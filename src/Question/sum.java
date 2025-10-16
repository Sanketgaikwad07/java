package Question;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {//string is parameter and args ia s argument
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int x=sc.nextInt();

        System.out.println("Enter the second Number");
        int y=sc.nextInt();
int sum=x+y;
        System.out.println("The sum two number is= " +sum);
    }
}