/*Q.11 K-th Element of Two Sorted Arrays
Given two sorted arrays of size m and n respectively, you are tasked with 
finding the element that would be at the k’th position of the final sorted array.

Examples:
Input : Array 1 - 2 3 6 7 9
 Array 2 - 1 4 8 10
 k = 5
Output : 6
Explanation: The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
Input : Array 1 - 100 112 256 349 770
 Array 2 - 72 86 113 119 265 445 892
 k = 7
Output : 256
Explanation: Final sorted array is -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.
 */

import java.util.Arrays;
import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 2, 3, 6, 7 };
        int b[] = { 1, 4, 8, 10 };
        int length = a.length + b.length;
        int c[] = new int[length];

        System.out.println("Enter Position: ");
        int pos = sc.nextInt();

        if (a.length == b.length) {
            for (int i = 0, j = 0, k = 0; i < a.length; i++, j++, k++) {
                c[k] = a[i] + b[i];
            }
            System.out.println("Resultant array is:");
            System.out.println(Arrays.toString(c));
            Arrays.sort(c);
        } else {
            System.out.println("Length of both array should be same");
        }

        sc.close();
    }

}
