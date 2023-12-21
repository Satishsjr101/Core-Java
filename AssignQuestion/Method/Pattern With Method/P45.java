/*----
    5 
   44
  333
 2222
11111
--------- */

import java.util.Scanner;

public class P45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P45().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int sp = 1; sp < i; sp++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
