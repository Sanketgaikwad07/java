// AdvancedDrone.java
public class AdvancedDrone {
    private double x, y, z; // Position in 3D space
    private boolean isFlying; // Is the drone flying?
    private double speed; // Speed of the drone
    private double batteryLevel; // Battery level (0 to 100)
    private static final double MAX_BATTERY = 100.0;

    // Constructor
    public AdvancedDrone() {
        x = 0;
        y = 0;
        z = 0;
        speed = 0; // No speed initially
        batteryLevel = MAX_BATTERY; // Full battery
        isFlying = false;
    }

    // Take off function
    public void takeOff() {
        if (!isFlying) {
            if (batteryLevel > 10) {  // Safety check for battery level
                System.out.println("Taking off...");
                z = 1; // Drone starts flying
                isFlying = true;
                speed = 5; // Set a default speed for takeoff
            } else {
                System.out.println("Battery too low to take off!");
            }
        } else {
            System.out.println("Drone is already in the air!");
        }
    }

    // Land function
    public void land() {
        if (isFlying) {
            System.out.println("Landing...");
            z = 0; // Drone lands
            isFlying = false;
            speed = 0; // Stop the drone
        } else {
            System.out.println("Drone is already on the ground!");
        }
    }

    // Move the drone in 3D space
    public void move(double deltaX, double deltaY, double deltaZ) {
        if (isFlying) {
            if (batteryLevel
