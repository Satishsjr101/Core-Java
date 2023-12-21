/* 28. P is one-dimensional array of integers. Write a Java program search for a data VAL from P. 
	If VAL is present in the array then “element found ” otherwise “element not found” should be displayed.  */

import java.util.Scanner;

public class A28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print("Enter element: ");
        int val = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("Element Found");
        else
            System.out.println("Element not Found");
        sc.close();
    }
}
