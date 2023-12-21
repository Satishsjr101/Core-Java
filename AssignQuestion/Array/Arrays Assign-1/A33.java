// 33. Write a java program to impelment binary search algorithm

import java.util.Scanner;

public class A33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 2, 4, 6, 7, 9, 10, 13, 16, 19 };
        int low = 0;
        int high = a.length;
        int mid;
        boolean flag = false;
        System.out.print("Enter Num to insert: ");
        int ele = sc.nextInt();
        while (low <= high) {
            mid = (low + high) / 2;
            if (ele == a[mid]) {
                flag = true;
                break;
            } else if (ele > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (flag)
            System.out.println("Element Found ");
        else
            System.out.println("Element Not Found");
        sc.close();
    }
}
