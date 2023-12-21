//  Write a program to find the sum and product of all elements of an array.

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0, product = 1;
        for (i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            sum = sum + a[j];
            product = product * a[j];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

    }
}
