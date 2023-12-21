// Q.14Write a program in to array size to be user input print it

import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
