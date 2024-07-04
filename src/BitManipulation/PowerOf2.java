package BitManipulation;

public class PowerOf2 {
    private static boolean isPowerOfTwo(int num) {
        // for example 16
        // 16 = 10000
        // 15 = 01111
        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
    }
}
