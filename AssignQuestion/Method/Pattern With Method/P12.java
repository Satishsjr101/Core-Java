/*--------
a
ab
abc
abcd
abcde
------- */

import java.util.Scanner;

public class P12 {
    public void printAlphabet(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P12().printAlphabet(n);
        sc.close();
    }
}
