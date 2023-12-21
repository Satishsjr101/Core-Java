//8) WAP to print Fibonacci series.

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a nth: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }
    }
}
