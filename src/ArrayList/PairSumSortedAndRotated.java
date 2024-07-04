package ArrayList;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PairSumSortedAndRotated {
    private static boolean hasTarget(@NotNull ArrayList<Integer> list, int target) {
        // brute force - O(n^2)
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i) + list.get(j) == target) {
//                    return true;
//                }
//            }
//        }

        // two pointer - O(n)

        // find the pivot O(log(n))
        int left = 0, right = list.size() - 1;
        int pivot = -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) > list.get(mid + 1)) {
                pivot = mid;
                break;
            } else if (list.get(mid) < list.get(right)) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (pivot == -1) {
            left = 0;
            right = list.size() - 1;
        } else {
            left = pivot + 1;
            right = pivot;
        }

        // moving pointer O(n)
        while (left != right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                return true;
            } else if (sum > target) {
                right = (right - 1 + list.size()) % list.size();      // modular arithmetic because list is rotated
            } else {
                left = (left + 1) % list.size();
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(11, 15, 6, 8, 9, 10));

        int target = 16;

        System.out.println(hasTarget(list, target));
    }
}
