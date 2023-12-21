/*______

___________
|\      / |
|  \  /   |
|   /\    |
|  /  \   |
|/_______\|

__________ */

import java.util.Scanner;

public class P83 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P83().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        if (n % 2 == 1)
            n = n + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n)
                    System.out.print("-");
                else if (j == 1 || j == n)
                    System.out.print("|");
                else if (i == j)
                    System.out.print("\\");
                else if (j == n + 1 - i)
                    System.out.print("/");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
