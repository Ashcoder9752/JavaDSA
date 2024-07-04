package Recursion;

public class FibonacciNthTerm {
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        int num = 20;
        System.out.println(fibonacci(num));
    }
}
