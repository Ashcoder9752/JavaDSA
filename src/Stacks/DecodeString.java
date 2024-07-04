package Stacks;

import java.util.Stack;

//        Given an encoded string, return its decoded string.
//        The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
//        You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
//        The test cases are generated so that the length of the output will never exceed 10^5.
//
//
//        Example 1:
//        Input: s = "3[a]2[bc]"
//        Output: "aaabcbc"
//
//        Example 2:
//        Input: s = "3[a2[c]]"
//        Output: "accaccacc"
//
//        Example 3:
//        Input: s = "2[abc]3[cd]ef"
//        Output: "abcabccdcdcdef"
//
//
//        Constraints:
//                1 <= s.length <= 30
//                s consists of lowercase English letters, digits, and square brackets '[]'.
//                s is guaranteed to be a valid input.
//                All the integers in s are in the range [1, 300].

public class DecodeString {
    private static String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // when ']' is encountered means encoding is completed we have to decode it now
            if (c == ']') {
                // extract the string between the [brackets]
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && !stack.peek().equals("[")) {
                    sb.insert(0, stack.pop());
                }
                stack.pop();

                // extract the number
                StringBuilder num = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    num.insert(0, stack.pop());
                }
                int number = Integer.parseInt(num.toString());

                // push the string into the stack for further operation
                String str = sb.toString();
                stack.push(str.repeat(number));
            } else {
                stack.push(String.valueOf(c));
            }
        }

        // combine the strings from the stack
        StringBuilder ans = new StringBuilder();
        for (String str : stack) {
            ans.append(str);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "10[a]";
        System.out.println(decodeString(str));
    }
}
