//  wap to define an array of integer and assign value in program and print sum of all values

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum: " + sum);

    }
}
