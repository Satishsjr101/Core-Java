// 6 Find a missing number in an array

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter KEY : ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Number Found ");
        else
            System.out.println("Missing !!! ");

    }
}
