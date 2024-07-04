package Recursion;

public class XtoThePowerN {
    private static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * pow(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }
}
