/*______
x      x
xx    xx
xxx  xxx
xxxxxxxx
xxx  xxx
xx    xx
x      x
___________*/

import java.util.Scanner;

// NOT SOLVE PROPERLY
public class P76_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P76_2().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        int j = 1;

        for (int i = 1; i < 2 * n; i++) {
            if (j <= n) {
                for (j = 1; j <= 2 * n; j++) {
                    if (j <= i || j >= 2 * n - i)
                        System.out.print("X");
                    else
                        System.out.print(" ");
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
