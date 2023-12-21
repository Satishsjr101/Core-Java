/*--------
*
**
****
*******
***********
--------------- */

import java.util.Scanner;

public class P40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P40().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            k = k + i;
            System.out.println();
        }
    }
}
