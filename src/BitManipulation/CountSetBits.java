package BitManipulation;

public class CountSetBits {
    private static void countSetBits(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >>> 1;
        }
    }

    public static void main(String[] args) {

    }
}
