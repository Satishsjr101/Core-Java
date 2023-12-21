/*--------

*********
 ******* 
  ***** 
   ***
    * 
--------- */

import java.util.Scanner;

public class P69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P69().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j < 2 * n; j++) {
                if ((j > n - i) && j < n + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
