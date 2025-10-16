class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass (Specialized)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Subclass (Specialized)
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class heiracy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark();

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow();
    }
}

