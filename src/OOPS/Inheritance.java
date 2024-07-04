package OOPS;

/**
 * Inheritance is when properties and methods of base class are passed onto a derived class.<br><br>
 * <pre>
 *           ---------- -> Fish
 *         /
 *       /
 * Animal ------------- -> Bird ----------- -> Peacock
 *       \
 *         \                     ,--------- -> Dog
 *           ---------- -> Mammal --------- -> Cat
 *                               `--------- -> Human
 * </pre>
 * <br>
 * <p>
 *     There are 4 types of inheritance:-<br>
 *     <font color="Green"><b>SINGLE LEVEL INHERITANCE</b></font><br>
 *     - when a subclass has only one super class (Fish, Bird, Mammal)<br>
 *     <font color="Green"><b>MULTI LEVEL INHERITANCE</b></font><br>
 *     - when a class is derived from a class which is also derived from another class (Peacock, Dog, Cat, Human)<br>
 *     <font color="Green"><b>HIERARCHICAL INHERITANCE</b></font><br>
 *     - when different classes are derived from the same class (Dog & Cat & Human)<br>
 *     <font color="Green"><b>HYBRID INHERITANCE</b></font><br>
 *     - when a there is a combination system of inheritance (This whole inheritance tree)<br>
 * </p>
 */

public class Inheritance {
    public static void main(String[] args) {
        Human man = new Human();
        man.noOfLegs = 2;
        man.breathe();
        man.grow();
        man.walk();
        man.talk();
        System.out.println("no of legs = " + man.noOfLegs);
    }
}

class Animal {
    void breathe() {
        System.out.println("Breathing...");
    }
    void grow() {
        System.out.println("Growing...");
    }
}

class Fish extends Animal {
    int noOfFins;
    void swim() {
        System.out.println("Swimming...");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flying...");
    }
}

class Peacock extends Bird {
    String breed = "peacock";
    void dance() {
        System.out.println("Peacock is dancing...");
    }
}

class Mammal extends Animal {
    int noOfLegs;

    void walk() {
        System.out.println("Walking...");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("woof-woof...");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("meow...meow...");
    }
}

class Human extends Mammal {
    void talk() {
        System.out.println("Human is talking...");
    }
}