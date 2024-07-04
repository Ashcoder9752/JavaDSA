package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    private static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[arr.length];

        for (int i = answer.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] answer = nextGreaterElement(arr);

        for (int j : answer) {
            System.out.print(j + " ");
        }
    }
}
