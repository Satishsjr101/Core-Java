/*___
1
1 2
1  3
1   4
1  3
1 2
1
_________ */

import java.util.Scanner;

public class P79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P79().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {

        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j == 1 || (i == j) || j == 2 * n - i))
                    System.out.print((j));
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
