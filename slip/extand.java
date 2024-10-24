// Base class
class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    double area() {
        return 0; // Default implementation (can be overridden)
    }

    void display() {
        System.out.println("Shape: " + name);
    }
}

// Subclass for Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(doubl
