package BitManipulation;

public class FastExponent {
    /**
     *
     * example <code>2<sup>19</sup></code><br>
     * <code>(2<sup>2</sup>)<sup>19/2</sup> = 4<sup>9</sup> * 2</code><br>
     * this <code>2</code> will be multiplied with answer as the power is odd<br>
     * <code>(4<sup>2</sup>)<sup>9/2</sup> = 16<sup>4</sup> * 4</code><br>
     * this <code>4</code> will be multiplied with answer as the power is odd<br>
     * <code>(16<sup>2</sup>)<sup>4/2</sup> = 256<sup>2</sup></code><br>
     * <code>(256<sup>2</sup>)<sup>2/2</sup> = (256*256)<sup>1</sup><br></code>
     * this <code>(256 * 256)</code> will be multiplied with answer as the power is odd<br>
     * it will be the complete multiplication<br>
     */
    private static int fastExponent(int num, int pow) {
        int ans = 1;

        while (pow > 0) {
            if ((pow & 1) != 0) {
                ans *= num;
            }
            num *= num;
            pow >>= 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponent(5, 3));
    }
}
