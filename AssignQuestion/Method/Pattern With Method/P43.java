/*--------
    1
   12
  123
 1234
12345
--------- */

import java.util.Scanner;

public class P43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P43().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = n; j >= 1; j--) {
                if (i >= j) {
                    System.out.print(k);
                    k++;
                } else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
