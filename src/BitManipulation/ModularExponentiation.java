package BitManipulation;

public class ModularExponentiation {
    /**
     * <p>
     *     <code>(a * a) | x = ((a | x) * (a | x)) | x</code><br>
     *     think from bottom up approach
     * </p>
     * <br>
     * <p>
     *     example <code>2<sup>19</sup></code><br>
     *     <code>(2<sup>2</sup>)<sup>19/2</sup> = 4<sup>9</sup> * 2</code><br>
     *     this <code>2</code> will be multiplied with answer as the power is odd<br>
     *     <code>(4<sup>2</sup>)<sup>9/2</sup> = 16<sup>4</sup> * 4</code><br>
     *     this <code>4</code> will be multiplied with answer as the power is odd<br>
     *     <code>(16<sup>2</sup>)<sup>4/2</sup> = 256<sup>2</sup></code><br>
     *     <code>(256<sup>2</sup>)<sup>2/2</sup> = (256*256)<sup>1</sup><br></code>
     *     this <code>(256 * 256)</code> will be multiplied with answer as the power is odd<br>
     *     it will be the complete multiplication<br>
     * </p>
     * <br>
     * <p>
     *     for bigger powers this answer can result in a big number can overflow the <code>Integer.MAX_VALUE</code>
     *     and while calculating modulus we can use the above property
     * </p>
     */
    private static int modularExponentiation(int base, int exponent, int modulus) {
        long answer = 1; // to encounter the overflow condition
        base %= modulus; // in case base is bigger than modulus

        if (base == 0) { // in case base is completely divisible by modulus
            return 0;    // any power of base will be completely divisible by modulus
        }

        while (exponent > 0) {
            if ((exponent & 1) != 0) {
                answer *= base % modulus;
            }
            exponent >>= 1;
            base *= base % modulus;
        }
        return (int) answer;
    }

    public static void main(String[] args) {
    }
}
