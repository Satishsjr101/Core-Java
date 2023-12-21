/*_____
1
10
1 1
1  0
10101
__________ */

import java.util.Scanner;

public class P27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P27().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i < n && (j >= 2 && j <= i - 1))
                    System.out.print(" ");
                else if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }

            }
            System.out.println();
        }
    }
}