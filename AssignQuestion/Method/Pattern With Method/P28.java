/*-------
1
123                                                                                                                                                                                                                                                                
12345
1234567
123456789
------ */

import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P28().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
