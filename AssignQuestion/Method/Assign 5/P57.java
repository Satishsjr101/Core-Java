// 57) WAP to print all the prime numbers between two entered numbers

import java.util.Scanner;

public class P57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number ");
        int n2 = sc.nextInt();
        int temp;
        int j;
        for (int i = n1; i <= n2; i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > i / 2 && i > 1) {
                System.out.println(i + " prime");
            }
        }
    }
}
