package Backtracking;

import java.util.Arrays;

public class ChangeArray {
    private static void changeArray(int[] arr, int index, int value) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[index] = value;
        changeArray(arr, index + 1, value + 1);
        arr[index] -= 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArray(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
