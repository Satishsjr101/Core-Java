// Q13. Write a program to array elements to print sum of Cubic Values

import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        int a[] = new int[3];
        Scanner sc = new Scanner(System.in);
        int cube = 1, sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            cube = a[i] * a[i] * a[i];
            System.out.println("Cube: " + cube);
            sum = sum + cube;
        }
        System.out.println("Sum of cubic values: " + sum);
    }
}
