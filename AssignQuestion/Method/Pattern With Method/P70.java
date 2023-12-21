/*------
* * * * * 
 * * * * 
  * * * 
   * * 
    *
---------- */

import java.util.Scanner;

public class P70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P70().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n; j++) {
                if ((j > n - i) && j < n + i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
