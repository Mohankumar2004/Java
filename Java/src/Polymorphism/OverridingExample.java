package Polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();   // Runtime decision
        a.sound();       // Dog barks

        a = new Cat();   // Runtime decision
        a.sound();       // Cat meows
    }
}
