/*------
    A
   B B
  C   C
 D     D
EEEEEEEEE
-------- */

import java.util.Scanner;

public class P67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P67().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < 2 * n; j++) {
                if ((j == n + 1 - i) || (j == n - 1 + i) || i == n)
                    System.out.print(ch);
                else
                    System.out.print(" ");
            }
            ch++;
            System.out.println();
        }
    }
}
