/* 29. Suppose a one-dimensional array AR containing integers is arranged in ascending order. 
	Write a java program to search for an integer from AR with the help of Binary search method,  */

import java.util.Scanner;

public class A29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print("Enter element: ");
        int ele = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        boolean flag = false;

        while (low <= high) {
            mid = (low + high) / 2;
            if (ele == arr[mid]) {
                flag = true;
                break;
            } else if (ele > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (flag)
            System.out.println("Element Found");
        else
            System.out.println("Element not Found");
        sc.close();
    }

}
