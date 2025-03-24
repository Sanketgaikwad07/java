public class DroneControl {

    // Assuming DroneAPI is a library to interact with the drone hardware
    private DroneAPI drone;

    public DroneControl() {
        drone = new DroneAPI();
    }

    public void takeOff() {
        drone.takeOff();
        System.out.println("Drone is taking off...");
    }

    public void moveForward() {
        drone.moveForward(10);  // Move forward 10 meters
        System.out.println("Drone moving forward.");
    }

    public void hover() {
        drone.hover();
        System.out.println("Drone is hovering.");
    }

    public void land() {
        drone.land();
        System.out.println("Drone is landing...");
    }

    public static void main(String[] args) {
        DroneControl droneControl = new DroneControl();

        // Sample sequence
        droneControl.takeOff();
        droneControl.moveForward();
        droneControl.hover();
        droneControl.land();
    }
}
