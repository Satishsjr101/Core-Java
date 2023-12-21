// wap to print max and minimum value in given array

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }
        int max = a[0], min = a[0];
        for (int i = 0; i < 5; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}
