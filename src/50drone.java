//public class drone {

import java.util.Random;

// Simple AI Drone Simulation
class drone {
    private final int maxAltitude = 100;
    private int x, y, altitude;
    private Random random;

    public drone() {
        this.x = 0;
        this.y = 0;
        this.altitude = 10;
        this.random = new Random();
    }

    public static void main(String[] args) {
        drone drone = new drone();
        for (int i = 0; i < 10; i++) {
            drone.move();
            drone.scan();
            drone.status();
            System.out.println("------------------------");
        }
    }

    public void move() {
        x += random.nextInt(11) - 5; // Move randomly in x-direction
        y += random.nextInt(11) - 5; // Move randomly in y-direction
        altitude += random.nextInt(7) - 3; // Change altitude randomly
        altitude = Math.max(0, Math.min(altitude, maxAltitude)); // Keep altitude in bounds
    }

    public void scan() {
        System.out.println("Scanning surroundings...");
    }

    public void status() {
        System.out.println("Drone Position: (" + x + ", " + y + "), Altitude: " + altitude);
    }
}

