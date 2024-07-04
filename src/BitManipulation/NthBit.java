package BitManipulation;

public class NthBit {
    private static void getNthBit(int num, int n) {
        int bitMask = 1 << n;
        System.out.println((num & bitMask) == 0 ? "0" : "1");
    }

    private static void setNthBit(int num, int n) {
        int bitMask = 1 << n;
        System.out.println(num | bitMask);
    }

    private static void clearNthBit(int num, int n) {
        int bitMask = 1 << n;
        System.out.println(num & ~bitMask);
    }

    private static void updateNthBit(int num, int n, int newBit) {
//        if (newBit == 0) {
//            clearNthBit(num, n);
//        } else {
//            setNthBit(num, n);
//        }

        // clearing nth bit
        num = num & ~(1 << n);

        // setting the nth bit
        int bitMask = newBit << n;
        System.out.println(num | bitMask);
    }

    private static void clearLastNBits(int num, int n) {
        // (~0) = 11111111
        int bitMask = (~0) << n;
        System.out.println(num & bitMask);
    }

    private static void clearRangeOfBits(int num, int i, int j) {
        // For example 10
        // 00001010
        // a = 11100000
        // b = 00000011
        // bitMask = 11100011
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        System.out.println(num & bitMask);
    }

    public static void main(String[] args) {
    }
}
