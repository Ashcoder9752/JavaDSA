package Recursion;

public class PrintBinaryStrings {
    private static void printBinaryStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
}
