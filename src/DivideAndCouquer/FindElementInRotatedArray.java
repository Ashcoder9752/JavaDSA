package DivideAndCouquer;

public class FindElementInRotatedArray {
    private static int findElement(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) { // mid is in the left of rotation
            if (arr[start] <= target && target < arr[mid]) {
                return findElement(arr, target, start, mid - 1);
            } else {
                return findElement(arr, target, mid + 1, end);
            }
        } else { // mid is in the right of rotation
            if (arr[end] >= target && target > arr[mid]) {
                return findElement(arr, target, mid + 1, end);
            } else {
                return findElement(arr, target, start, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int target = 6;
        System.out.println(findElement(arr, target, 0, arr.length - 1));
    }
}
