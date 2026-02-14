package Abstraction;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key.");
    }

    public void stop() {
        System.out.println("Car stops when brakes are applied.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle v = new Car();  // Upcasting to the interface type
        v.start();        // Calls Car's implementation of start()
        v.stop();         // Calls Car's implementation of stop()
    }
}
