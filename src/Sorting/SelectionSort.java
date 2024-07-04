package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minPos]) {
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 2, 1, 8, 7, 5, 4, 3, 1 };
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
