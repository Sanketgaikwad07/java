public class Bottle {
    private String color;
    private int capacity; // in milliliters
    private boolean isFull;

    // Constructor
    public Bottle(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.isFull = false; // initially, the bottle is empty
    }

    // Getter methods
    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return isFull;
    }

    // Method to fill the bottle
    public void fill() {
        if (!isFull) {
            isFull = true;
            System.out.println("The bottle is now full.");
        } else {
            System.out.println("The bottle is already full.");
        }
    }

    // Method to empty the bottle
    public void empty() {
        if (isFull) {
            isFull = false;
            System.out.println("The bottle is now empty.");
        } else {
            System.out.println("The bottle is already empty.");
        }
    }

    // Method to display bottle details
    public void displayDetails() {
        System.out.println("Bottle Color: " + color);
        System.out.println("Bottle Capacity: " + capacity + " ml");
        System.out.println("Is the bottle full? " + (isFull ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Bottle myBottle = new Bottle("Blue", 500); // Blue bottle, 500ml capacity
        myBottle.displayDetails();
        myBottle.fill();
        myBottle.displayDetails();
        myBottle.empty();
        myBottle.displayDetails();
    }
}
