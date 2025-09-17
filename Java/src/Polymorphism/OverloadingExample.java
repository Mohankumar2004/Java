package Polymorphism;

class Calculator {
    // Overloaded methods (same name, different parameters)

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 int: " + calc.add(5, 10));
        System.out.println("Sum of 2 double: " + calc.add(5.5, 2.5));
        System.out.println("Sum of 3 int: " + calc.add(1, 2, 3));
    }
}
