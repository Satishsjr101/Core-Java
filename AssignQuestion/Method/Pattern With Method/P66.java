/*-------
    1
   1*1
  1***1
 1*****1
111111111
------------ */

import java.util.Scanner;

public class P66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P66().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < 2 * n; j++) {
                if ((j == n + 1 - i) || (j == n - 1 + i) || i == n)
                    System.out.print("1");
                else if (j < n + 1 - i || (j >= n + i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
