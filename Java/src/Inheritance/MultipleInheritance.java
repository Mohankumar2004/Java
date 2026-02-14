package Inheritance;

interface Animal2 {
    void eat();
}

interface Pet {
    void play();
}

class Dog2 implements Animal2, Pet {
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void play() {
        System.out.println("The dog plays fetch.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.eat();
        d.play();
    }
}
