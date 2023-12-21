/*______
x
xx
xxx
xxxx
xxx
xx
x
___________*/

import java.util.Scanner;

public class P76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P76().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        int j = 1;

        for (int i = 1; i < 2 * n; i++) {
            if (j <= n) {
                for (j = 1; j <= i; j++) {
                    System.out.print("X");
                }
            } else {
                for (int k = 1; k <= 2 * n - i; k++) {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
