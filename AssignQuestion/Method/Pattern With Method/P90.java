/*____
*        *
 *     *
   * *
    *
   * *
 *     *
*        *


_____________________ */

import java.util.Scanner;

public class P90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P90().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        if (n % 2 == 0)
            n = n + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (i == j || j == n + 1 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
