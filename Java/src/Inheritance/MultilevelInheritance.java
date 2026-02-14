package Inheritance;

class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

class Dog1 extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.walk();
        d.bark();
    }
}
