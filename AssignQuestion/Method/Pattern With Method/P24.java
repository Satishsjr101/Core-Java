/*-------
*
**
*@*
*@@*
*****
-------- */

import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P24().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == n || i == j)
                    System.out.print("*");
                else if ((j < i))
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
