package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (!swap) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 2, 1, 8, 7, 5, 4, 3, 1 };
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}