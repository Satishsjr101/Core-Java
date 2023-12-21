//  9.Initialize and print all elements of a 2D array.

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = { { 1, 2 }, { 3, 4 } };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println(a[i][j]);
            }

        }
    }
}
