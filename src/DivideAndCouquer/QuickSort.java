package DivideAndCouquer;

import java.util.Arrays;

/**
 * Worst case is when everytime the pivot is the largest(in ascending sorted)<br> or smallest(in descending sorted)<br>
 * <br>
 * Sorted array is the worst case of Quick Sort
 */

public class QuickSort {
    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int iterator = start - 1;

        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot) {
                iterator++;
                int temp = arr[i];
                arr[i] = arr[iterator];
                arr[iterator] = temp;
            }
        }
        return iterator;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}