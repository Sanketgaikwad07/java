import java.util.Scanner;

abstract class Vehicle {
    abstract void start();
    void fuelType() {
        System.out.println("Uses fuel");
    }
}
class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with a key");
    }
}



 class abstrct {

     static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cr infor: ");
        int a=sc.nextInt();
        System.out.println(a +" ");

        Vehicle car=new Car();
        car.fuelType();
        car.start();
        car.start();


    }
}
