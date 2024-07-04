package ArrayList;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Swapping {
    private static void swap(@NotNull List<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int index1 = 1;
        int index2 = 3;

        System.out.println(list);
        swap(list, index1, index2);
        System.out.println(list);
    }
}
