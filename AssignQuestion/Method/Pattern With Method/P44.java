/*------
    1
   22
  333
 4444
55555
-------- */

import java.util.Scanner;

public class P44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P44().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= 1; j--) {
                if (i >= j)
                    System.out.print(k);
                else
                    System.out.print(" ");
            }
            k++;

            System.out.println();
        }
    }
}
