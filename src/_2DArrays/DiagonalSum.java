package _2DArrays;

public class DiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            // i = j
            sum += matrix[i][i];

            // secondary diagonal
            // i + j = arr.length - 1
            // j = [arr.length - 1 - i]
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(diagonalSum(matrix));
    }
}
