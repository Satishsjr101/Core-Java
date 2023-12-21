//  Q.16 Write a Java program to calculate the average value of array elements

import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        float average = 0;
        float total = 0;
        int a[] = new int[size];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
            total = total + a[i];
        }
        average = total / size;
        System.out.println("Average: " + average);

    }
}
