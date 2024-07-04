package Recursion;

public class CountSubstrings {
    public static void main(String[] args) {
        String str = "abcab";
        int length = str.length();
        System.out.println(countSubstrings(str, 0, length - 1, length));
    }

    private static int countSubstrings(String str, int beginningIndex, int endingIndex, int length) {
        if (length <= 1) {
            return length;
        }

        int result = countSubstrings(str, beginningIndex + 1, endingIndex, length - 1) +
                countSubstrings(str, beginningIndex, endingIndex - 1, length - 1) -
                countSubstrings(str, beginningIndex + 1, endingIndex - 1, length - 2);

        if (str.charAt(beginningIndex) == str.charAt(endingIndex)) {
            result++;
        }
        return result;
    }
}
