package _2DArrays;

public class PrintSpiral {
    public static void printSpiral(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            // right
            for (int i = startRow + 1; i < endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int i = endCol; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }
            // left
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 17},
                {5, 6, 7, 8, 18},
                {9, 10, 11, 12, 19},
                {13, 14, 15, 16, 20},
                {21, 22, 23, 24, 25}
        };
        printSpiral(matrix);
    }
}
