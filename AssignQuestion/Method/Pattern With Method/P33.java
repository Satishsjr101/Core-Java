/*-------
ABCDE
ABCD
ABC
AB
A
----- */

import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P33().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
