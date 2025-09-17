package Encapsulation;

class Student {
    // Private variables (hidden from outside)
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {   // validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setters
        s.setName("Mohan");
        s.setAge(20);

        // Getting values using getters
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());

        // Invalid case
        s.setAge(-5);  // validation message
    }
}
