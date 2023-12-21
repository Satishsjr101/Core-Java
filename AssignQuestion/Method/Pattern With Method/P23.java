/*------
a
bc
d f
g  j
klmno

-------- */

import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P23().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'a';
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == n || i == j)
                    System.out.print(ch);
                else
                    System.out.print(" ");
                ch++;
            }
            System.out.println();
        }
    }
}
