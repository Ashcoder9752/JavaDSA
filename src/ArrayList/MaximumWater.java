package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MaximumWater {
    private static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        // brute force O(n^2)
//        for (int line1 = 0; line1 < height.size() - 1; line1++) {
//            for (int line2 = line1 + 1; line2 < height.size(); line2++) {
//                int currentHeight = Math.min(height.get(line1), height.get(line2));
//                int width = line2 - line1;
//                maxWater = Math.max(maxWater, currentHeight * width);
//            }
//        }

        // two pointer O(n)
        int line1 = 0;
        int line2 = height.size() - 1;
        while (line1 < line2) {
            int currentHeight = Math.min(height.get(line1), height.get(line2));
            int width = line2 - line1;
            maxWater = Math.max(maxWater, currentHeight * width);

            if (height.get(line1) < height.get(line2)) {
                line1++;
            } else {
                line2--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(List.of(1, 8, 6, 2, 5, 4, 8, 3, 7));

        System.out.println(storeWater(height));
    }
}
