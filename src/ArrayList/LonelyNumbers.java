package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyNumbers {
    private static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list) {
        if (list.size() == 1) {
            return list;
        }
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int prev = (i - 1 >= 0) ? list.get(i - 1) : Integer.MIN_VALUE;
            int cur = list.get(i);
            int next = (i + 1) < list.size() ? list.get(i + 1) : Integer.MAX_VALUE;

            if (cur - 1 != prev && cur + 1 != next && cur != prev && cur != next) {
                result.add(cur);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 3, 5, 3));
        System.out.println(lonelyNumbers(list));
    }
}
