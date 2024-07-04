package OOPS;

public class Constructors {
    public static void main(String[] args) {
        Example ex = new Example();
        Example ex1 = new Example(1);
        Example ex2 = new Example(2, "Alex");
        ex2.arr = new int[3];
        ex2.arr[0] = 12;
        ex2.arr[1] = 2;
        ex2.arr[2] = 4;
        Example ex3 = new Example(ex2);
        ex2.arr[2] = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(ex3.arr[i]);
        }
    }
}

/**
 * Until a constructor is not created manually<br>
 * Java creates a <font color="green">DEFAULT CONSTRUCTOR</font>, here<br>
 * <code>Example() {}</code><br>
 * As soon as a constructor is created manually the default constructor is destroyed<br><br>
 * These constructors reflect <font color="green">POLYMORPHISM</font>
 */

class Example {
    int id;
    String name;
    int[] arr;
    Example() {
        System.out.println("non-parameterized constructor");
    }

    Example(int id) {
        this.id = id;
        System.out.println("parameterized constructor");
    }

    Example(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("parameterized constructor with constructor overloading");
    }

//    Example(Example ex) {
//        this.id = ex.id;
//        this.arr = ex.arr;
//        System.out.println("copy constructor");
//        System.out.println("shallow copy");
//    }

    Example(Example ex) {
        this.arr = new int[ex.arr.length];
//        for (int i = 0; i < ex.arr.length; i++) {
//            this.arr[i] = ex.arr[i];
//        }
        System.arraycopy(ex.arr, 0, this.arr, 0, ex.arr.length);
        System.out.println("copy constructor");
        System.out.println("deep copy");
    }
}