/*-------
123456789
 1+++++7
  1+++5
   1+3
    1
--------- */

import java.util.Scanner;

public class P75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P75().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        int m = n + 1;
        for (int i = 1; i <= m; i++) {

            for (int sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * (m - i); j++) {
                if (i == 1 || j == 1 || (j == 2 * n + 1 - 2 * i))
                    System.out.print(j);
                else
                    System.out.print("+");
            }
            System.out.println();
        }
    }
}
