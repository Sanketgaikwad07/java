import java.util.Scanner;

 class primeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to calculator");
        System.out.print("enter the 4 side in cms: ");
        double first=sc.nextDouble();
        double second=sc.nextDouble();

        double thrid=sc.nextDouble();

        double foruth=sc.nextDouble();
        double perimeter=first+second+thrid+foruth;
        System.out.println("perimerter ot your ractange is: "+perimeter);
    }
}
