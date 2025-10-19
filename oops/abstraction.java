abstract class Vehicle {
    abstract void start();

    void stop() {
        
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();
        
        bike.start();
        bike.stop();
    }
}
