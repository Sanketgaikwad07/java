class Laptop {
    // Attributes
    private final String brand;
    private final String model;
    private final float price;
    private final int ramSize;
    private final double screenSize;
    private final String storageType;
    private final int batteryLife;
    private final String operatingSystem;
    // Constructor
    public Laptop(String brand, String model, float price, int ramSize, double screenSize,
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

    public float getPrice() {
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


    public static void comparePrice(Laptop laptop1, Laptop laptop2) {
        if (laptop1.getPrice() > laptop2.getPrice()) {
            System.out.println(laptop1.getBrand() + " " + laptop1.getModel() + " is more expensive.");
        } else if (laptop1.getPrice() < laptop2.getPrice()) {
            System.out.println(laptop2.getBrand() + " " + laptop2.getModel() + " is more expensive.");
        } else {
            System.out.println("Both laptops have the same price.");
        }
    }

    public static void compareBatteryLife(Laptop laptop1, Laptop laptop2) {
        if (laptop1.getBatteryLife() > laptop2.getBatteryLife()) {
            System.out.println(laptop1.getBrand() + " " + laptop1.getModel() + " has better battery life.");
        } else if (laptop1.getBatteryLife() < laptop2.getBatteryLife()) {
            System.out.println(laptop2.getBrand() + " " + laptop2.getModel() + " has better battery life.");
        } else {
            System.out.println("Both laptops have the same battery life.");
        }
    }


    public static void main(String[] args) {
        // Create two laptop objects
        Laptop laptop1 = new Laptop("HP", "EliteBook", 40000, 16, 17.5, "SSD", 12, "Windows 11");
        Laptop laptop2 = new Laptop("Apple", "MacBook Pro 14", 1999, 32, 14.2, "SSD", 18, "macOS");

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
