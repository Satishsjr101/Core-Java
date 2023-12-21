/*_____
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1
_________ */

import java.util.Scanner;

public class P73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P73().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {

        for (int i = n; i >= 1; i--) {

            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
