package Stacks;

import java.util.Stack;

public class DuplicateParentheses {
    private static boolean hasDuplicate(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ')') {
//                if (stack.pop() == '(') {
//                    return true;
//                }
//                while (true) {
//                    if (stack.isEmpty() || stack.pop() == '(') break;
//                    // we can remove checking of stack is empty because it is given in the question that string is a valid parenthesis
//                }
//            } else {
//                stack.push(str.charAt(i));
//            }
//        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (stack.pop() != '(') {
                    count++;
                }
                if (count == 0) {
                    return true;
                }
            } else {
                stack.push(str.charAt(i));
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)*(c+d))";

        System.out.println(hasDuplicate(str));
    }
}
