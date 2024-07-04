package Misc;

/**
 * Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to tile the given board using the 2 x 1 tiles. A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.
 * <br><br>
 * <font color="green">Amazon</font>
 */

public class TillingProblem {
    private static int tillingProblem(int i) {
        if (i <= 1) {
            return 1;
        }
        return tillingProblem(i - 1) + tillingProblem(i - 2);
    }

    public static void main(String[] args) {
        System.out.println(tillingProblem(2));
    }
}