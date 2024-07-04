package Backtracking;

public class MazeSolver {
    private static void printMaze(int[][] maze) {
        for (int[] rows : maze) {
            for (int cell : rows) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void solveMaze(int[][] maze) {
        int[][] sol = new int[maze.length][maze[0].length];
        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.print("Solution doesn't exist");
            return;
        }
        printMaze(sol);
    }

    public static boolean isSafe(int[][] maze, int row, int col) {
        // if (row, col outside maze) return false
        return (row >= 0 && row < maze.length
                && col >= 0 && col < maze.length && maze[row][col] == 1);
    }

    public static boolean solveMazeUtil(int[][] maze, int row, int col, int[][] sol) {
        if (row == maze.length - 1 && col == maze.length - 1 && maze[row][col] == 1) {
            sol[row][col] = 1;
            return true;
        }
        // Check if maze[row][col] is valid
        if (isSafe(maze, row, col)) {
            if (sol[row][col] == 1) return false;
            sol[row][col] = 1;
            if (solveMazeUtil(maze, row + 1, col, sol)) return true;
            if (solveMazeUtil(maze, row, col + 1, sol)) return true;
            sol[row][col] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 1, 1},
                {0, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 0, 1, 1}
        };
        solveMaze(maze);
    }
}
