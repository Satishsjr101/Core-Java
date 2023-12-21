/*----
55555
 4__4
  3_3 
   22
    1
------ */

import java.util.Scanner;

public class P53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P53().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j >= 2 && j < i && i < n)
                    System.out.print("_");
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
