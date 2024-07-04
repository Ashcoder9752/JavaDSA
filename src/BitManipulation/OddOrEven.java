package BitManipulation;

public class OddOrEven {
    public static void oddOrEven(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
    public static void main(String[] args) {
        oddOrEven(12);
        oddOrEven(13);
        oddOrEven(-6);
        oddOrEven(-5);
    }
}
