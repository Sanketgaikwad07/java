import java.util.Scanner;

 class Compoundinterest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the pricinple vale is: ");
        int pricinple=s.nextInt();
        System.out.println("enter the rate value is: ");
        float rate=s.nextFloat();
        System.out.println("enter the year is: ");
        float year= s.nextFloat();
        double com=pricinple *Math.pow((1+rate/100),year);
        System.out.println("your compound interest is : "+com);


    }
}
