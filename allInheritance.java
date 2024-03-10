// Define the interface
interface Vehicle {
    // Abstract methods
    void start();
    void stop();
}

// Implement the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("The car has started.");
    }

    public void stop() {
        System.out.println("The car has stopped.");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Create an object of the class that implements the interface
        Vehicle car = new Car();

        // Call methods of the interface
        car.start();
        car.stop();
    }
}