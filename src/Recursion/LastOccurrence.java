package Recursion;

public class LastOccurrence {
    private static int lastOccurrence(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurrence(arr, i + 1, key);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 3};
        System.out.println(lastOccurrence(arr, 0, 4));
    }
}
