public class Bat {
    private String name;
    private int age;
    private boolean isFlying;

    public Bat(String name, int age) {
        this.name = name;
        this.age = age;
        this.isFlying = false;
    }

    public void fly() {
        if (!isFlying) {
            isFlying = true;
            System.out.println(name + " is now flying.");
        } else {
            System.out.println(name + " is already flying.");
        }
    }

    public void land() {
        if (isFlying) {
            isFlying = false;
            System.out.println(name + " has landed.");
        } else {
            System.out.println(name + " is already on the ground.");
        }
    }

    public void sleep() {
        System.out.println(name + " is sleeping upside down.");
    }

    public void makeSound() {
        System.out.println(name + " makes echolocation sounds.");
    }

    // Main method for testing
    public static void main(String[] args) {
        Bat myBat = new Bat("Bruce", 3);
        myBat.fly();
        myBat.makeSound();
        myBat.land();
        myBat.sleep();
    }
}
