package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NumberKeypad {
    private static final String[] mapping = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        System.out.println(letterCombinations("22"));
    }
    public static List<String> letterCombinations(String digits) {
        ArrayList<String> answer = new ArrayList<>();
        if (digits.isEmpty()) {
            return answer;
        }
        StringBuilder output = new StringBuilder();
        int index = 0;
        findCombinations(digits, answer, output, index);
        return answer;
    }

    private static void findCombinations(String digits, ArrayList<String> answer, StringBuilder output, int index) {
        if (index == digits.length()) {
            answer.add(output.toString());
            return;
        }

        String word = mapping[digits.charAt(index) - '2'];
        for (int i = 0; i < word.length(); i++) {
            output.append(word.charAt(i));
            findCombinations(digits, answer, output, index + 1);
            output.delete(output.length() - 1, output.length());
        }
    }
}