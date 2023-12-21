/*Q.18 Write a program to print all the LEADERS in the array. An element is a 
leader if it is greater than all the elements to its right side. And the rightmost 
element is always a leader.

For example:
Input: arr[] = {16, 17, 4, 3, 5, 2},
Output: 17, 5, 2

Input: arr[] = {1, 2, 3, 4, 5, 2},
Output: 5,2  */
public class A18 {
    public static void main(String[] args) {
        int a[] = { 16, 17, 4, 3, 5, 2 };
        int i = 0, j = 0;
        for (i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                System.out.print(a[i + 1] + " ");

            } else {
                System.out.print(" ");
            }

        }
    }
}
