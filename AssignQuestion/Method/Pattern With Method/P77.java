/*_____
1
12
123
1234
123
12
1
__________ */

import java.util.Scanner;

public class P77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P77().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {

        for (int i = 1; i < 2 * n; i++) {
            if (i <= 4) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print(j);
                }
            }

            System.out.println();
        }
    }
}
