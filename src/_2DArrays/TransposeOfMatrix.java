package _2DArrays;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static int[][] transposeOf(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[i].length; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4},
                {11, 4},
                {2, 2}
        };
        System.out.println("Original Array : ");
        for(int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
        System.out.println("Transposed Array: ");
        for(int[] array : transposeOf(matrix)) {
            System.out.println(Arrays.toString(array));
        }
    }
}
