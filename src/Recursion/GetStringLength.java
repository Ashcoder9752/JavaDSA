package Recursion;

public class GetStringLength {
    public static void main(String[] args) {
        String str = "hello World";
        System.out.println(getStringLength(str));
    }
    private static int getStringLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return getStringLength(str.substring(1)) + 1;
    }
}
