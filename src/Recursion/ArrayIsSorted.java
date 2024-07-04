package Recursion;

public class ArrayIsSorted {
    private static boolean isSorted(int[] arr, int index) {
        if (index == 0) {
            return true;
        }
        if (arr[index - 1] > arr[index]) {
            return false;
        }
        return isSorted(arr, index - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6};
        System.out.println(isSorted(arr, arr.length - 1));
    }
}
