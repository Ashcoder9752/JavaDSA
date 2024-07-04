package Backtracking;

public class FindSubsets {
    private static void findSubsets(String str, StringBuilder ans, int index) {
        if (index == str.length()) {
            if (ans.isEmpty()) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Every character of the string would have a choice of being in the answer or not
        // for choice Yes
        findSubsets(str, ans.append(str.charAt(index)), index + 1);

        // We need to remove the characters we have added before moving ahead
        ans.delete(ans.length() - 1, ans.length());

        // for choice No
        findSubsets(str, ans, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, new StringBuilder(), 0);
    }
}
