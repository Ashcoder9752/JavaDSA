package Sorting;

import java.util.Arrays;

public class MargeSort {
    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        // dividing the array into two parts
        int mid = start + (end - start) / 2;

        // recursively calling merge sort for both parts
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[j] < arr[i]) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        for (i = 0, j = start; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}