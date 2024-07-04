package Recursion;

import java.math.BigInteger;

public class Factorial {
    private static BigInteger factorial(BigInteger fact) {
        if (fact.equals(BigInteger.ZERO) || fact.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return fact.multiply(factorial(fact.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        int num = 500;
        System.out.println(factorial(BigInteger.valueOf(num)));
    }
}
