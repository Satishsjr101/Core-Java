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
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i < n * 2; i++) {

            for (int j = 1; j < n * 2; j++) {

                if (i == n || j == n) {
                    if ((i <= n && j == n) || (j < n && i == n)) {
                        System.out.print((i + j) - n);
                    }
                    if (j > n || i > n) {
                        System.out.print(n * 3 - (i + j));
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}