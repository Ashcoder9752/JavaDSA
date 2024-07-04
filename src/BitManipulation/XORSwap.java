package BitManipulation;

public class XORSwap {
    public static void main(String[] args) {
        // edge condition x ^ x is always 0
        int x = 2;
        int y = 3;
        y = x ^ y;
        x = x ^ y;
        y = x ^ y;

        System.out.println(x + " " + y);
    }
}
