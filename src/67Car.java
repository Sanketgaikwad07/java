class Car {
    int noOfWheels;
    int noOfDoors;
    int MaxSpeed;
    String carname;
    String model;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String carName, String model, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        MaxSpeed = maxSpeed;
        this.carname = carName;
        this.model = model;
        this.company = company;
    }

    public static void main(String[] args) {
        Car Thar = new Car(4, 4, 180, "Audi", "Q7", "Ford");
        System.out.println(Thar);
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", MaxSpeed=" + MaxSpeed +
                ", carname='" + carname + '\'' +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
