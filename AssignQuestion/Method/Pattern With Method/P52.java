/*---
12345
 1__4
  1_3
   12
    1
----- */

import java.util.Scanner;

public class P52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P52().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j >= 2 && j < i && i < n)
                    System.out.print("_");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
