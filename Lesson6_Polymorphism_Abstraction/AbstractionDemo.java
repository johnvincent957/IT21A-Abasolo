
abstract class Animal {

    // Abstract method
    abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Child Class 1
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

// Child Class 2
class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

// Main Class
public class AbstractionDemo {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("=== ABSTRACTION DEMO ===");

        dog.makeSound();
        dog.sleep();

        System.out.println();

        cat.makeSound();
        cat.sleep();
    }
}
