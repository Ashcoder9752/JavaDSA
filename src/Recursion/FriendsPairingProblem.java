package Recursion;

/**
 * Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once find the total number of ways friends can remain single or can be paired up.
 */

public class FriendsPairingProblem {
    private static int friendsPairingProblem(int n) {
        if (n <= 2) {
            return n;
        }
        // one friend can choose any of the n-1 friends to pir with
        return friendsPairingProblem(n- 1) + (n - 1) * friendsPairingProblem(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPairingProblem(4));
    }
}
