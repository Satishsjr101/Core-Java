/*----
    A
   AB
  A_C
 A__D
ABCDE
------- */

import java.util.Scanner;

public class P48 {
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            char k = 'A';
            for (int j = 1; j <= i; j++) {
                if (j >= 2 && (j <= i - 1) && i < n)
                    System.out.print("_");
                else
                    System.out.print(k);
                k++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P48().printPattern(n);
        sc.close();
    }
}
