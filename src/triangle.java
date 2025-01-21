import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to area calcluator");
        System.out.println("please enter the your base : ");
        double base = sc.nextDouble();
        System.out.println("please enter the hight: ");
        double hight = sc.nextDouble();


        double area =  (base * hight)/2;

        System.out.println("The area triangle is:  " + area + "cms2");


    }
}
