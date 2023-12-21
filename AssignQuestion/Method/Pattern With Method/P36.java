/*------
ABCDE
A  D
A C
AB
A

------ */

import java.util.Scanner;

public class P36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P36().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                if (i == n || j == 1 || i == j)
                    System.out.print(ch);
                else
                    System.out.print(" ");
                ch++;
            }
            System.out.println();
        }
    }
}
