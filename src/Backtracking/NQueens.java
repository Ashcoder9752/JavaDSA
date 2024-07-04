package Backtracking;

import java.util.Arrays;

public class NQueens {
    private static boolean isSafe(char[][] board, int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonally up left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonally up right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(char[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }

        System.out.println("---------------");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    private static void nQueens(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            noOfWays++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                board[row][col] = 'X';
            }
        }
    }

    static int noOfWays = 0;

    public static void main(String[] args) {
        int n = 20;
        char[][] board = new char[n][n];

//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = 'X';
//            }
//        }

        for (char[] chars : board) {
            Arrays.fill(chars, 'X');
        }

        nQueens(board, 0);

        System.out.println("Total no of ways = " + noOfWays);
    }
//    for printing only one solution
//    line 47: private static boolean nQueens(char[][] board, int row) {
//    line 51: return true;
//    line 57: if(nQueens(board, row + 1)) {
//                 return true;
//             }
//    line 61: return false;
//             }

//    line 79: if(!nQueens(board, 0)) {
//                 System.out.println("Solution is not possible");
//             }
}
