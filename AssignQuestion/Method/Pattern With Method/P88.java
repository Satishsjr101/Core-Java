/*-------
    1
    2
    3
    4
123454321
    4
    3
    2
    1
-------- */

import java.util.Scanner;

public class P88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P88().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (i <= n && j <= n) {
                    if (i == n)
                        System.out.print(j);
                    else if (j == n)
                        System.out.print(i);
                    else
                        System.out.print(" ");
                } else {
                    if (i == n)
                        System.out.print(2 * i - j);
                    else if (j == n)
                        System.out.print(2 * j - i);
                    else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}