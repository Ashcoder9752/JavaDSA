package Recursion;

public class OptimizedPower {
    private static long optimizedPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        long halfPower = optimizedPower(base, exponent / 2);
        long answer = halfPower * halfPower;
        if (exponent % 2 == 1) {
            answer *= base;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }
}