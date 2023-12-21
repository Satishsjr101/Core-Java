// 34. Write a java program to implement linear search

import java.util.Scanner;

public class A34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 19, 1, 4, 3, 6, 7, 15, 11 };
        boolean flag = false;
        System.out.print("Enter Num to insert: ");
        int ele = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (ele == a[i]) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("Element Found ");
        else
            System.out.println("Element Not Found ");

        sc.close();

    }
}
