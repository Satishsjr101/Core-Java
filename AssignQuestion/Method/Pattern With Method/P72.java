/*------
A B C D E
 A B C D
  A B C
   A B
    A
---------- */

import java.util.Scanner;

public class P72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P72().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {

        for (int i = n; i >= 1; i--) {
            char ch = 'A';
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
