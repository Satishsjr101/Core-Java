/*===========
1
00
111
0000
11111
============ */

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        printStar(n);
        sc.close();
    }

    public static void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
