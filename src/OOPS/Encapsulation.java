package OOPS;

/**
 * Encapsulation is defined as the wrapping up of data and methods under a single unit.
 * It also implements data hiding<br>
 * Defining all the properties and methods in a single entity[Class].<br>
 * using getters, setters along with access modifiers for hiding data.
 */
public class Encapsulation {
    // Private variables to be accessed only within this class
    private String name;
    private int age;

    // Public setter methods to set the values of private variables
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { // Example of validation
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    // Public getter methods to retrieve the values of private variables
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        // Accessing and setting the values using public methods
        obj.setName("John");
        obj.setAge(25);

        // Retrieving and printing the values using public methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
