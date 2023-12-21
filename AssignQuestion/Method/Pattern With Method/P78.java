/*____
   1
  12
 123
1234
 123
  12
   1
_________ */

import java.util.Scanner;

public class P78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P78().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {

        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= n && (i + j >= n + 1))
                    System.out.print((i + j - n));
                else if (i - j < n && i > n)
                    System.out.print((n - (i - j)));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
