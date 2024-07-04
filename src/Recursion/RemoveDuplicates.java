package Recursion;

public class RemoveDuplicates {
    private static void removeDuplicates(String str, int index, StringBuilder newString, boolean[] map) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char ch = str.charAt(index);
        if (map[ch - 'a']) {
            removeDuplicates(str, index + 1, newString, map);
        } else {
            map[ch - 'a'] = true;
            removeDuplicates(str, index + 1, newString.append(ch), map);
        }
    }

    public static void main(String[] args) {
        String str = "helloworld";
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    }
}
