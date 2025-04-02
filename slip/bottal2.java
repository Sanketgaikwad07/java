public class Bottle {
    private String color;
    private int capacity; // in milliliters
    private boolean isFull;
    private String material;
    private String liquidType;
    private int timesFilled;
    private int timesEmptied;

    // Constructor
    public Bottle(String color, int capacity, String material, String liquidType) {
        this.color = color;
        this.capacity = capacity;
        this.material = material;
        this.liquidType = liquidType;
        this.isFull = false;
        this.timesFilled = 0;
        this.timesEmptied = 0;
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

    public String getMaterial() {
        return material;
    }

    public String getLiquidType() {
        return liquidType;
    }

    // Methods to fill and empty the bottle
    public void fill() {
        if (!isFull) {
            isFull = true;
            timesFilled++;
            System.out.println("The bottle is now full with " + liquidType + ".");
        } else {
            System.out.println("The bottle is already full.");
        }
    }

    public void empty() {
        if (isFull) {
            isFull = false;
            timesEmptied++;
            System.out.println("The bottle is now empty.");
        } else {
            System.out.println("The bottle is already empty.");
        }
    }

    // Method to change the liquid type in the bottle
    public void changeLiquidType(String newLiquidType) {
        if (!isFull) {
            liquidType = newLiquidType;
            System.out.println("The bottle now contains " + newLiquidType + ".");
        } else {
            System.out.println("You can't change the liquid while the bottle is full!");
        }
    }

    // Method to display bottle details
    public void displayDetails() {
        System.out.println("Bottle Details:");
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity + " ml");
        System.out.println("Material: " + material);
        System.out.println("Liquid Type: " + liquidType);
        System.out.println("Is the bottle full? " + (isFull ? "Yes" : "No"));
        System.out.println("Times Filled: " + timesFilled);
        System.out.println("Times Emptied: " + timesEmptied);
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "Bottle [Color=" + color + ", Capacity=" + capacity + "ml, Material=" + material +
               ", LiquidType=" + liquidType + ", IsFull=" + isFull + "]";
    }

    public static void main(String[] args) {
        Bottle myBottle = new Bottle("Green", 750, "Plastic", "Water");
        
        // Display initial bottle details
        myBottle.displayDetails();
        
        // Fill the bottle and show details
        myBottle.fill();
        myBottle.displayDetails();
        
        // Try changing liquid type (while bottle is full)
        myBottle.changeLiquidType("Soda");
        
        // Empty the bottle and change liquid type
        myBottle.empty();
        myBottle.changeLiquidType("Soda");
        
        // Fill again
        myBottle.fill();
        myBottle.displayDetails();
        
        // Try printing the bottle with toString()
        System.out.println(myBottle.toString());
    }
}
