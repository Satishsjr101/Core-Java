/*-----------
A
BCD
EFGHI    
JKLMNOP
----------- */

import java.util.Scanner;

public class P41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P41().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
