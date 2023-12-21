// 47) WAP to print tables of all the numbers between two entered numbers

import java.util.Scanner;

public class P47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            for (int j = 1; j <= 10; j++) {
                int temp = i * j;
                System.out.print(temp + "  ");
            }
            System.out.println("\n");
        }
    }

}
