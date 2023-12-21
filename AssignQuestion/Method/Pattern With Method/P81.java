/*___
   *
  ***
 ***** 
******* 
 ***** 
  *** 
   *
_________ */

import java.util.Scanner;

public class P81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P81().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        if (n % 2 == 1)
            n = n + 1;
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i <= n) {
                    if ((j >= n + 1 - i) && (j <= n + i - 1))
                        System.out.print("*");
                    else
                        System.out.print(" ");

                } else {
                    if ((j >= i - n) && (j <= 3 * n - i))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
