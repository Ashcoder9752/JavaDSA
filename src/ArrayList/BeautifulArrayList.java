package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeautifulArrayList {
    private static int[] beautifulArrayList(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);

        while (answer.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int num : answer) if (2 * num <= n) temp.add(2 * num);
            for (int num : answer) if (2 * num - 1 <= n) temp.add(2 * num - 1);
            answer = temp;
        }
//        int[] result = new int[answer.size()];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = answer.get(i);
//        }
//        return result;
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(beautifulArrayList(n)));
    }
}
