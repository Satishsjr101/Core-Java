// wap to find and print prime numbers in given array

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }
        // boolean isPrime = false;
        for (i = 0; i < a[i] / 2; i++) {

            if (a[i] % 2 == 0) {
                break;
            }
        }
        if (i > a[i] / 2)
            System.out.println("Prime Number");
        else
            System.out.println("not prime");

    }
}