// Define the abstract Animal class
abstract class Animal {
    // Abstract method that must be implemented by subclasses
    public abstract void makeSound();

    // Concrete method that can be called directly
    public void sleep() {
        System.out.println("Zzz...");
    }
}

// Define a concrete subclass of Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}

// Define another concrete subclass of Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances of the concrete subclasses
        Dog dog = new Dog();
        Cat fish = new Cat();

        // Call methods on the instances
        dog.makeSound(); // Output: Woof woof!
        dog.sleep();     // Output: Zzz...

        fish.makeSound(); // Output: Meow!
        fish.sleep();     // Output: Zzz...
    }
}