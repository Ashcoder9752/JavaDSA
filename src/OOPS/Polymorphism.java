package OOPS;

/**
 * <font color="green">POLY</font> - many, <font color="green">MORPH</font> - forms<br>
 * Polymorphism is the idea that an entity in code such as a variable, function or object can have more than one form.<br>
 * <br>
 * There are two types of polymorphism:-<br>
 * <font color="green">COMPILE-TIME POLYMORPHISM</font><br>
 * - method overloading (methods with same name but different signature)<br>
 * <font color="green">RUN-TIME POLYMORPHISM</font><br>
 * - method overriding (methods in derived class changed the functionality of the method from base class)
 */

public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time Polymorphism (Method Overloading)
        Calculation calc = new Calculation();
        System.out.println("Addition of integers: " + calc.add(5, 10));
        System.out.println("Addition of doubles: " + calc.add(2.5, 3.5));

        // Runtime Polymorphism (Method Overriding)
        Person p = new Man(); // Using the reference of the superclass to the subclass object
        p.makeSound(); // Executes the overridden method in Dog class
    }
}

// Compile-time Polymorphism (Method Overloading)
class Calculation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism (Method Overriding)
class Person {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Man extends Person {
    @Override
    void makeSound() {
        System.out.println("Talking");
    }
}
