// Base class
class Shape {
    private String name; // Private field

    Shape(String name) {
        this.name = name;
    }

    public String getName() { // Getter method
        return name;
    }

    double area() {
        return 0; // Default implementation (can be overridden)
    }

    void display() {
        System.out.println("Shape: " + getName());
    }
}

// Subclass for Circle
class Circle extends Shape {
    private double radius; // Private field

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() { // Getter method
        return radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    private double width; // Private field
    private double height; // Private field

    Rectangle(double width, double height) {
        super("Rec
