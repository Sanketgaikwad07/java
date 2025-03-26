// ElectricBike class
public class ElectricBike {
    private String model;
    private int batteryLevel; // Percentage (0 to 100)
    private int speed; // Current speed in km/h
    private boolean isElectricMode; // True if in electric mode, false for manual
    private int totalDistance; // Total distance traveled in km

    // Constructor
    public ElectricBike(String model, int batteryLevel, int speed, boolean isElectricMode) {
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.speed = speed;
        this.isElectricMode = isElectricMode;
        this.totalDistance = 0; // Initialize the distance to 0
    }

    // Getter and Setter methods
    public
