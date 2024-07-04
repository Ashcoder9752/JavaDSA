package Recursion;

public class SumOfN_Numbers {
    private static int sumOfN_Numbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumOfN_Numbers(n - 1);
        }
    }
    public static void main(String[] args) {
        int num = Short.MAX_VALUE;
        System.out.println(sumOfN_Numbers(num));
    }
}