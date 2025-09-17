package Polymorphism;

class Vehicle {
    // Overloaded methods (Compile-time Polymorphism)
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void start(String keyType) {
        System.out.println("Vehicle is starting with " + keyType);
    }

    // Method to be overridden (Runtime Polymorphism)
    void drive() {
        System.out.println("Generic vehicle driving...");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving smoothly...");
    }
}

class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Bike is zooming fast...");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // ---------- Compile-time Polymorphism (Overloading) ----------
        Vehicle v1 = new Vehicle();
        v1.start();                // Calls start()
        v1.start("smart key");     // Calls overloaded start(String)

        System.out.println("====================");

        // ---------- Runtime Polymorphism (Overriding) ----------
        Vehicle v;  // Reference of parent

        v = new Car();  
        v.drive();   // Car's drive()

        v = new Bike(); 
        v.drive();   // Bike's drive()
    }
}
