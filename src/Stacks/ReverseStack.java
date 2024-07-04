package Stacks;

import java.util.Stack;

public class ReverseStack {
    // time: O(n) space: O(n)
//    private static MyStack<Integer> reverse(MyStack<Integer> stack) {
//        MyStack<Integer> reversedStack = new MyStack<>();
//        while(!stack.isEmpty()) {
//            reversedStack.push(stack.pop());
//        }
//        return reversedStack;
//    }

    // time: O(n) space: O(1) [ignoring the recursion stack overhead]
    private static Stack<Integer> reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return stack;
        }

        int top = stack.pop();
        reverse(stack);
        return pushAtBottom(stack, top);
    }

    private static Stack<Integer> pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return stack;
        }

        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);

        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        Stack<Integer> reversedStack = reverse(stack);

        System.out.println(reversedStack);
    }
}