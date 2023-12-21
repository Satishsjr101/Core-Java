// 56) WAP to print factorial of all the numbers between two entered numbers

import java.util.Scanner;

public class P56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number ");
        int n2 = sc.nextInt();
        int fact;

        for (int i = n1; i <= n2; i++) {
            fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            System.out.println(i + " Factorial is " + fact);
        }
    }
}
