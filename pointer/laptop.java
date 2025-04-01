class Laptop {
    // Attributes
    private String brand;
    private String model;
    private double price;
    private int ramSize; // in GB
    private double screenSize; // in inches

    // Constructor
    public Laptop(String brand, String model, double price, int ramSize, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ramSize = ramSize;
        this.screenSize = screenSize;
    }

    // Methods to get laptop details
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

    // Method to display laptop information
    public void displayLaptopInfo() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Screen Size: " + screenSize + " inches");
    }

    public static void main(String[] args) {
        // Create a laptop object
        Laptop myLaptop = new Laptop("Dell", "XPS 13", 999.99, 16, 13.3);

        // Display laptop information
        myLaptop.displayLaptopInfo();
    }
}
