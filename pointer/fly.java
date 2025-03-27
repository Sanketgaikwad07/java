// Drone.java
public class Drone {
    private double x, y, z; // Position in 3D space
    private boolean isFlying; // Is the drone in the air?

    // Constructor
    public Drone() {
        x = 0;
        y = 0;
        z = 0;
        isFlying = false;
    }

    // Take off function
    public void takeOff() {
        if (!isFlying) {
            System.out.println("Taking off...");
            z = 1; // Drone starts flying
            isFlying = true;
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
