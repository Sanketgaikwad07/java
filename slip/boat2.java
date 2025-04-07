// Define the Boat class with more features
class Boat {
    // Properties of the boat
    private String name;
    private double length; // in meters
    private double weight; // in kilograms
    private String engineType; // "Motor" or "Sail"
    private double speed; // in knots
    private double fuelLevel; // in percentage (0 to 100)
    private boolean sailUp; // to track if the sail is up or down

    // Constructor to initialize the boat properties
    public Boat(String name, double length, double weight, String engineType, double fuelLevel) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.engineType = engineType;
        this.fuelLevel = fuelLevel;
        this.speed = 0; // Initially, the boat is not moving
