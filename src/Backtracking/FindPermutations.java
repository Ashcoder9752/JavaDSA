package Backtracking;

public class FindPermutations {
    private static void findPermutations(StringBuilder str, StringBuilder ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            // "abcde" = "ab" + "de" = "abde"
            StringBuilder newStr = new StringBuilder(str.substring(0, i)).append(str.substring(i + 1));
            findPermutations(newStr, ans.append(chr));
            ans.delete(ans.length() - 1, ans.length());
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(new StringBuilder(str), new StringBuilder());
    }
}
