/*------
a
bc
def
ghij
klmno
-------- */

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P16().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        char ch = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
