/*---------
123456
54321
1234
321
12
1
----------- */

import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P39().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0)
                    System.out.print(j);
                else
                    System.out.print((i - j) + 1);
            }
            System.out.println();
        }
    }
}
