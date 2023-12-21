// 42) WAP to find out HCF of a number

import java.util.Scanner;

public class P42 {
    public static void main(String[] args) {
        int a, b, i, hcf = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        for (i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                System.out.println(hcf);
            }
        }
        // System.out.println(hcf);

    }
}
