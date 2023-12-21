/*------
    A
   ABC
  ABCDE
 ABCDEEF
ABCDEFGHI
------------ */

import java.util.Scanner;

public class P63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P63().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
