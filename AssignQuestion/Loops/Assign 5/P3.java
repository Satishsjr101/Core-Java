//3) WAP to find out the sum of N natural number

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a number: ");
        int n = sc.nextInt();
        int i, sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);
    }
}
