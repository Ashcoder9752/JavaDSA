package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int[] count = new int[max + 1];

        for (int num : nums) {
            count[num]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 2, 1, 8, 7, 5, 4, 3, 1 };
        countingSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
