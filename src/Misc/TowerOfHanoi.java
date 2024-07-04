package Misc;

public class TowerOfHanoi {
    private static void towerOfHanoi(int disks, String source, String auxiliary, String destination) {
        if (disks == 0) {
            return;
        }
        towerOfHanoi(disks - 1, source, destination, auxiliary);
        System.out.println("Transfer disk " + source + " to " + destination);
        towerOfHanoi(disks - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int disks = 2;
        towerOfHanoi(disks, "A", "B", "C");
    }
}