/*Q.10 Check for Majority Element in a sorted array
Given an array arr of N elements, A majority element in an array arr of size N 
is an element that appears more than N/2 times in the array. The task is to 
write a function say isMajority() that takes an array (arr[] ), array’s size (n)
and a number to be searched (x) as parameters and returns true if x is 
a majority element (present more than n/2 times).

Examples:
Input: arr[] = {1, 2, 3, 3, 3, 3, 10}, x = 3
Output: True (x appears more than n/2 times in the given array)
Input: arr[] = {1, 1, 2, 4, 4, 4, 6, 6}, x = 4
Output: False (x doesn't appear more than n/2 times in the given array)
Input: arr[] = {1, 1, 1, 2, 2}, x = 1
Output: True (x appears more than n/2 times in the given array
METHOD 1 (Using Linear Search): Linearly search for the first occurrence of 
the element, once you find it (let at index i), check element at index i + n/2. If 
element is present at i+n/2 then return 1 else return 0. */

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        int a[] = { 4, 33, 4, 4, 7, 6, 4, 2, 4, 9 };
        isMajority(a);

    }

    public static void isMajority(int a[]) {
        Scanner sc = new Scanner(System.in);
        int n = a.length;
        System.out.println("Enter key: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x == a[i]) {
                count++;
            }
        }
        if (count >= n / 2)
            System.out.println("True (x appears more than n/2 times in the given array)");
        else
            System.out.println(" False (x doesn't appear more than n/2 times in the given array)");
    }
}
 