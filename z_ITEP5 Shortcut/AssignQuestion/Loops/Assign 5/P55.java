// 55) WAP to print all the odd numbers between two entered numbers

import java.util.Scanner;

public class P55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {

            if (i % 2 != 0) {
                System.out.println("Odd : " + i);
            }

        }

    }
}
