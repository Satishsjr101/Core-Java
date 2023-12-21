/* -------------------
*
*
*
*
*
 --------------------*/

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        printStar(n);
        sc.close();

    }

    public static void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" ");

            for (int j = 1; j <= 1; j++) {

                System.out.print("*");
            }
        }
    }
}
