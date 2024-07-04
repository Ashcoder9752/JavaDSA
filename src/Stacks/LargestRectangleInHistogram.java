package Stacks;

import java.util.Stack;

//        Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
//
//        Example 1:
//        Input: heights = [2,1,5,6,2,3]
//        Output: 10
//        Explanation: The above is a histogram where width of each bar is 1.
//        The largest rectangle is shown in the red area, which has an area = 10 units.
//
//        Example 2:
//        Input: heights = [2,4]
//        Output: 4
//
//        Constraints:
//                1 <= heights.length <= 10^5
//                0 <= heights[i] <= 10^4

public class LargestRectangleInHistogram {
    private static int largestRectangle(int[] height) {
        // previous smaller index
        Stack<Integer> stack = new Stack<>();
        int[] prev = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }

            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // clearing the stack
        stack = new Stack<>();

        // next smaller index
        int[] next = new int[height.length];
        for (int i = height.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }

            next[i] = stack.isEmpty() ? height.length : stack.peek();
            stack.push(i);
        }

        // calculating max area
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            int area = height[i] * ((next[i] - prev[i]) - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangle(height));
    }
}
