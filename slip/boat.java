// Define a Boat class
class Boat {
    // Properties of the boat
    private String name;
    private double length; // in meters
    private double weight; // in kilograms

    // Constructor to initialize the boat properties
    public Boat(String name, double length, double weight) {
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

    // Getter and Setter methods for each property
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to display boat information
    public void displayInfo() {
        System.out.println("Boat Name: " + name);
        System.out.println("Boat Length: " + length + " meters");
        System.out.println("Boat Weight: " + weight + " kg");
    }

    // Method to simulate the boat moving
    public void move() {
        System.out.println(name + " is moving through the water!");
    }

    // Method to simulate the boat stopping
    public void stop() {
        System.out.println(name + " has stopped.");
    }
}

// Main class to test the Boat class
public class Main
