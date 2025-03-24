public class AIDroneControl {

    private DroneAPI drone;
    private SensorAPI sensor;

    public AIDroneControl() {
        drone = new DroneAPI();
        sensor = new SensorAPI();  // Assuming a sensor API to detect obstacles
    }

    public void startObstacleAvoidance() {
        drone.takeOff();
        System.out.println("Drone is taking off...");
        
        while (true) {
            if (sensor.detectObstacle()) {
                System.out.println("Obstacle detected! Avoiding...");
                drone.moveBackward(5);  // Move backward to avoid obstacle
                drone.turnLeft(45);  // Turn left to avoid the obstacle
            } else {
                drone.moveForward(5);  // Keep moving forward if no obstacles
            }

            try {
                Thread.sleep(500);  // Check for obstacles every 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        AIDroneControl aiDroneControl = new AIDroneControl();
        aiDroneControl.startObstacleAvoidance();
    }
}
