package BitManipulation;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print((char) (ch & ~' '));
        }
    }
}
