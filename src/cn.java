// Abstraction: Abstract class
abstract class shape {
    abstract void draw();
}
// Encapsulation: Class with private data members and public methods
class Circle extends shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Encapsulated data accessed through public methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Abstraction: Override abstract method to provide implementation
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// Inheritance: Class inheriting from another class
class Rectangle extends shape {
    // Abstraction: Override abstract method to provide implementation
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Polymorphism: Class with method overloading
class Drawing {
    // Polymorphism: Method overloading
    public void drawShape(shape shape) {
        shape.draw();
    }

    // Method overloading
    public void drawShape(Circle circle) {
        System.out.println("Drawing Circle with radius: " + circle.getRadius());
    }
}

 class OOPExample {
    public static void main(String[] args) {
        // Encapsulation: Creating object of Circle class and setting radius
        Circle circle = new Circle(5.0);

        // Abstraction: Drawing circle
        circle.draw();

        // Encapsulation: Accessing radius using public method
        System.out.println("Circle Radius: " + circle.getRadius());

        // Encapsulation: Setting new radius
        circle.setRadius(7.0);

        // Abstraction: Drawing circle after setting new radius
        circle.draw();

        // Inheritance: Creating object of Rectangle class
        Rectangle rectangle = new Rectangle();

        // Abstraction: Drawing rectangle
        rectangle.draw();

        // Polymorphism: Creating object of Drawing class
        Drawing drawing = new Drawing();

        // Polymorphism: Drawing shape
        drawing.drawShape(circle);
        int a=0;
        int b=0;
        if(a==b){
            System.out.println("Equal");

                }else{
                System.out.println("not equal");
            }
        }
    }
 