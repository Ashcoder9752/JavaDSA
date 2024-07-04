package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MonotonicArrayList {
    private static boolean isMonotonic(List<Integer> list) {
        if (list.size() <= 2) {
            return true;
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                decreasing = false;
            } else if (list.get(i) < list.get(i - 1)) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3));
        System.out.println(isMonotonic(list));
    }
}