package Inheritance;
class Animal3 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.eat();   // inherited method
        d.bark();  // child method
    }
}

