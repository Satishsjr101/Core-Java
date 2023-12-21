/*------
    1
   11
  1*1
 1**1
11111
----- */

import java.util.Scanner;

public class P47 {
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // for (int sp = 1; sp < n - i; sp++) {
            // System.out.print(" ");
            // }
            for (int j = 1; j <= n; j++) {
                if (i == n || j == n || j == (n + 1 - i))
                    System.out.print("1");

                else if (j < n + 1 - i) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P47().printPattern(n);
        sc.close();
    }
}
