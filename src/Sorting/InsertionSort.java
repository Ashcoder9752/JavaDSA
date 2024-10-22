package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] < temp) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 2, 1, 8, 7, 5, 4, 3, 1 };
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
