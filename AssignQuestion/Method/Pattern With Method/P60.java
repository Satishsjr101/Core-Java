/*----
    X 
   X X 
  X__X
 X____X
X X X X X
----------------- */

import java.util.Scanner;

public class P60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P60().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j >= 2 && j < i && i < n)
                    System.out.print("_ ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
