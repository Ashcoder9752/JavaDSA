package Recursion;

public class FirstOccurrence {
    private static int firstOccurrence(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 3};
        System.out.println(firstOccurrence(arr, 0, 7));
    }
}
