/*-----
123456789
 1234567
  12345
   123
    1
------- */

import java.util.Scanner;

public class P71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P71().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        int m = n + 1;
        for (int i = 1; i <= m; i++) {
            for (int sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * (m - i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
