package OOPS;

/**
 * Hiding all unnecessary details and showing only the important part to the user<br>
 * <font color="green">ABSTRACT</font> - Idea (only in mind, kind of rough blueprint)<br>
 * <br>
 * Abstract classes cannot be instantiated<br>
 * Can have abstract and non-abstract methods<br>
 * can have constructors<br>
 * <br>
 * Abstract methods don't have implementation(body)<br>
 * When extended abstract methods must be overridden<br>
 * <br>
 * <font color="green">INTERFACE</font> is the blueprint of a class<br>
 * support multiple inheritance<br>
 * <br>
 * Abstract classes may have 0-100% abstraction (non-abstract methods), but an interface must have 100% abstraction (no non-abstract methods)<br>
 * All methods are public<br>
 * Variables are final, public and static by default
 */

public class Abstraction {
    public static void main(String[] args) {
        // Using abstract class
        Shape circle = new Circle();
        circle.draw();
        circle.display();

        Shape rectangle = new Rectangle();
        rectangle.draw();
        rectangle.display();

        // Using interface
        Sound cat = new Chicken();
        cat.makeSound();
    }
}
// Abstract class demonstrating abstraction
abstract class Shape {
    abstract void draw(); // Abstract method without implementation

    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete classes extending the abstract class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Interface demonstrating abstraction
interface Sound {
    void makeSound(); // Abstract method without implementation
}

// Class implementing the interface
class Chicken implements Sound {
    @Override
    public void makeSound() {
        System.out.println("Cluck");
    }
}