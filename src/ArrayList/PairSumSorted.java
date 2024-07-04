package ArrayList;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PairSumSorted {
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
        int left = 0, right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Collections.sort(list);

        int target = 19;

        System.out.println(hasTarget(list, target));
    }
}
