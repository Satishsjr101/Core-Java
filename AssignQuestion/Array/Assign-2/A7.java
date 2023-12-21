// Wap to Insert an element at a specific position in an Array in Jav

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter specific position: ");
        int pos = sc.nextInt();

        System.out.print("Enter number to insert: ");
        int insert = sc.nextInt();

        System.out.println();
        a[pos - 1] = insert;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
