import java.util.Scanner;

 class simpleInterest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to simpleinterest ");
        System.out.println("enter the P is : ");
        double P=sc.nextDouble();

        System.out.println("enter the value of T is: ");
        double T=sc.nextDouble();
        System.out.println("enter the value of R is: ");
        double R=sc.nextDouble();
          double area=(P*T*R)/100;
        System.out.println("the simple interest is: "+ area);

    }
}
