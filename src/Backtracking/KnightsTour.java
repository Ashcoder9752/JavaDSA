package Backtracking;

import java.util.Arrays;

public class KnightsTour {
    public static void main(String[] args) {
        int n = 8;
        int[][] grid = new int[n][n];
        for (int[] rows : grid) {
            Arrays.fill(rows, -1);
        }
        solveGrid(grid, 0, 0, 0);
    }

    private static boolean solveGrid(int[][] grid, int row, int col, int step) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid.length || grid[row][col] != -1) {
            return false;
        }

        grid[row][col] = step;

        if (step == grid.length * grid.length - 1) {
            for (int[] rows : grid) {
                for (int cell : rows) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
            return true;
        }

        int[] currentRow = {-2, -1, 1, 2, 2, 1, -1, -2};    // code will go through TLE for general paths
        int[] currentCol = {1, 2, 2, 1, -1, -2, -2, -1};    // as the size is very high or small grid only

        for (int i = 0; i < 8; i++) {
            if(solveGrid(grid, row + currentRow[i], col + currentCol[i], step + 1)) {
                return true;
            }
        }

        grid[row][col] = -1;                                // backtracking
        return false;
    }
}
