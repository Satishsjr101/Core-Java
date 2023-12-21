/*-------
*****
####
***
##
*
-------- */

import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P37().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0)
                    System.out.print("#");
                else
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}
