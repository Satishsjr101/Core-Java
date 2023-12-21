/*-------
EEEEE
DDDD
CCC
BB
A
------ */

import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P34().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        int k = 64 + n;
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (k));
            }
            k--;
            System.out.println();
        }
    }
}
