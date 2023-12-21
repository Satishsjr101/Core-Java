/*---
    *
   *_*
  *___* 
 *_____* 
*********
---------- */

import java.util.Scanner;

public class P64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P64().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                if (j >= 2 && j < 2 * i - 1 && i < n)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
