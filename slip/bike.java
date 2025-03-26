// ElectricBike class
public class ElectricBike {
    private String model;
    private int batteryLevel; // Percentage (0 to 100)
    private int speed; // Current speed in km/h
    private boolean isElectricMode; // True if in electric mode, false for manual

    // Constructor
    public ElectricBike(String model, int batteryLevel, int speed, boolean isElectricMode) {
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.speed = speed;
        this.isElectricMode = isElectricMode;
    }

    // Getter and Setter methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isElectricMode() {
        return isElectricMode;
    }

    public void setElectricMode(boolean isElectricMode) {
        this.isElectricMode = isElectricMode;
