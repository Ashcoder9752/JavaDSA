package Backtracking;

/**
 * <p>
 * There are only 2 choices R - right and D - down<br>
 * one has to move {@code (row - 1)} times down<br>
 * and {@code (col - 1)} times right to reach the target
 * </p>
 *
 * <p>
 *     Total number of ways is the sum of permutations {@code row - 1}(D) and {@code col - 1}(R) can be arranged<br>
 *     <br>
 *     For example:<br>
 *     {@code row = 3; col = 3;}<br>
 *     <br>
 *     Permutations :-<br>
 *     RRDD<br>
 *     RDRD<br>
 *     RDDR<br>
 *     DDRR<br>
 *     DRDR<br>
 *     DRRD<br>
 *     <br>
 *     Total 6 ways<br>
 *     <br>
 *     It can be calculated by formula : <sup>n</sup>P<sub>r</sub> = {@code n! / ((n - r)! * a! * b! * c! ...)}<br>
 *     Here n = total number of options that can be selected<br>
 *     r = total number of that are to be selected out of n elements<br>
 *     a = no. of items of similar type a<br>
 *     b = no. of items of similar type b<br>
 *     c = no. of items of similar type c
 * </p>
 * <p>
 *     Here 4 items out 4 items are to be selected, 2 are of kind (D) and 2 are of kind (R)<br>
 *     Formula : {@code ((3 - 1) + (3 - 1))! / ((3 - 1)! * (3 - 1)!) = 4! / (2! * 2!)}
 * </p>
 */

public class GridWaysOptimized {
    private static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    private static int gridWaysOptimized(int row, int col) {
        return factorial(row - 1 + col - 1) / (factorial(row - 1) * factorial (col - 1));
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println(gridWaysOptimized(row, col));
    }
}
