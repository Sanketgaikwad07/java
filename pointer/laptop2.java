class Laptop {
    // Attributes
    private String brand;
    private String model;
    private double price;
    private int ramSize; // in GB
    private double screenSize; // in inches
    private String storageType; // SSD or HDD
    private int batteryLife; // in hours
    private String operatingSystem; // Windows, macOS, Linux

    // Constructor
    public Laptop(String brand, String model, double price, int ramSize, double screenSize, 
                  String storageType, int batteryLife, String operatingSystem) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ramSize = ramSize;
        this.screenSize = screenSize;
        this.storageType = storageType;
        this.batteryLife = batteryLife;
        this.operatingSystem = operatingSystem;
    }

    // Getters and Setters for all attributes
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getStorageType() {
        return storageType;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    // Method to display laptop information
    public void displayLaptopInfo() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Type: " + storageType);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Operating System: " + operatingSystem);
    }

    // Method to compare prices of two laptops
    public static void comparePrice(Laptop laptop1, Laptop laptop2) {
        if (laptop1.getPrice() > laptop2.getPrice()) {
            System.out.println(laptop1.getBrand() + " " + laptop1.getModel() + " is more expensive.");
        } else if (laptop1.getPrice() < laptop2.getPrice()) {
            System.out.println(laptop2.getBrand() + " " + laptop2.getModel() + " is more expensive.");
        } else {
            System.out.println("Both laptops have the same price.");
        }
    }

    // Method to compare battery life
    public static void compareBatteryLife(Laptop laptop1, Laptop laptop2) {
        if (laptop1.getBatteryLife() > laptop2.getBatteryLife()) {
            System.out.println(laptop1.getBrand() + " " + laptop1.getModel() + " has better battery life.");
        } else if (laptop1.getBatteryLife() < laptop2.getBatteryLife()) {
            System.out.println(laptop2.getBrand() + " " + laptop2.getModel() + " has better battery life.");
        } else {
            System.out.println("Both laptops have the same battery life.");
        }
    }

    // Main method to test the Laptop class
    public static void main(String[] args) {
        // Create two laptop objects
        Laptop laptop1 = new Laptop("Dell", "XPS 13", 999.99, 16, 13.3, "SSD", 12, "Windows 11");
        Laptop laptop2 = new Laptop("Apple", "MacBook Pro 14", 1999.99, 32, 14.2, "SSD", 18, "macOS");

        // Display laptop information
        laptop1.displayLaptopInfo();
        System.out.println();
        laptop2.displayLaptopInfo();

        // Compare prices and battery life
        System.out.println("\nPrice Comparison:");
        Laptop.comparePrice(laptop1, laptop2);

        System.out.println("\nBattery Life Comparison:");
        Laptop.compareBatteryLife(laptop1, laptop2);
    }
}
