import java.util.Scanner;

/**
 * square
 */
public class square {
    public static void main(String[] args) {
        int n = 5;
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}