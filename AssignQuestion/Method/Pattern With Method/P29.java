/*------
1
222
33333
4444444
555555555
--------- */

import java.util.Scanner;

public class P29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P29().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(i);

            }
            System.out.println();
        }
    }
}
