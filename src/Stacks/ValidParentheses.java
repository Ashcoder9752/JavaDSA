package Stacks;

import java.util.Stack;

//        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Every close bracket has a corresponding open bracket of the same type.
//
//
//                Example 1:
//
//                Input: s = "()"
//                Output: true
//                Example 2:
//
//                Input: s = "()[]{}"
//                Output: true
//                Example 3:
//
//                Input: s = "(]"
//                Output: false
//
//
//                Constraints:
//
//                1 <= s.length <= 10^4
//                s consists of parentheses only '()[]{}'.


public class ValidParentheses {
    private static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // stack has no opening match for a closing parenthesis
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (top == '(' && ch != ')') {
                    return false;
                }
                if (top == '{' && ch != '}') {
                    return false;
                }
                if (top == '[' && ch != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({})[]";

        System.out.println(isValid(str));
    }
}
