/* Q.15 Find Second largest element in an array
Given an array of integers, our task is to write a program that efficiently finds 
the second-largest element present in the array.
Example:
Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second largest element is 34.
Explanation: The largest element of the 
array is 35 and the second 
largest element is 34
Input: arr[] = {10, 5, 10}
Output: The second largest element is 5.
Explanation: The largest element of 
the array is 10 and the second 
largest element is 5
Input: arr[] = {10, 10, 10}
Output: The second largest does not exist.
Explanation: Largest element of the array 
is 10 there is no second largest element */
public class A15 {
    public static void main(String[] args) {
        int a[] = { 10, 10, 5, 2, 1, 10 };
        int max = a[0];
        int max2 = a[0];
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {

            if (max < a[i]) {
                max = a[i];
                count++;
            }
            if (max2 > a[i] && max < a[i]) {
                max2 = a[i];
            }
        }

        System.out.println(max);
        System.out.println(max2);
    }

}
