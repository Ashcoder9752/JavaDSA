package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MultiDimensionalList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i);
            list2.add(i * 2);
            list3.add(i * 3);
        }

//        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        mainList.add(list1);
//        ArrayList<Integer> list2 = new ArrayList<>(List.of(6, 7, 8, 9, 10));
        mainList.add(list2);
//        ArrayList<Integer> list3 = new ArrayList<>(List.of(11, 12, 13, 14, 15));
        mainList.add(list3);

        for (ArrayList<Integer> integers : mainList) {
            ArrayList<Integer> currentList = new ArrayList<>(integers);
            for (Integer integer : currentList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(mainList);

//        for (int i = 0; i < mainList.size(); i++) {
//            ArrayList<Integer> currentList = new ArrayList<>(mainList.get(i));
//            for (int j = 0; j < currentList.size(); j++) {
//                System.out.print(currentList.get(j) + " ");
//            }
//            System.out.println();
//        }
    }
}
