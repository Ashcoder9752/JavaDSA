package Backtracking;

public class GridWays {
    private static int gridWays(int row, int col, int finalRow, int finalCol) {
        // using || instead && will also work fine and create lesser calls
        if (row == finalRow - 1 && col == finalCol - 1) {
            return 1;
        }
        if (row == finalRow || col == finalCol) {
            return 0;
        }

        int right = gridWays(row, col + 1, finalRow, finalCol);
        int down = gridWays(row + 1, col, finalRow, finalCol);

        return right + down;
    }
    public static void main(String[] args) {
        int finalRow = 3;
        int finalCol = 3;
        System.out.println(gridWays(0, 0, finalRow, finalCol));
    }
    // it can also be implemented with 2-D array (Grid)
}
