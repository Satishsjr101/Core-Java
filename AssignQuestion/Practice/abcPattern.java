
/*
 * ABCDDCBA    // Dynamic Program //
 * ABC  CBA   
 * AB    BA
 * A      A
 */
import java.util.Scanner;

public class abcPattern {
        Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            char revCH = (char) ((65 + n) - i);
            for (int j = 1; j <= n * 2; j++) {
                // 1st Half
                if (j <= n && j <= (n + 1 - i))
                    System.out.print(ch++);
                // 2nd Half
                else if (j >= n + i) {
                    System.out.print(revCH--);
                }
                // Spaces
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
