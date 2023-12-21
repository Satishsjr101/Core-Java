/* Q.17 Print All Distinct Elements of a given integer array
Given an integer array, print all distinct elements in an array. The given array 
may contain duplicates and the output should print every element only once. 
The given array is not sorted.

Examples:
Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
Output: 12, 10, 9, 45, 2

Input: arr[] = {1, 2, 3, 4, 5}
Output: 1, 2, 3, 4, 5            

Input: arr[] = {1, 1, 1, 1, 1}
Output: 1 */
public class A17 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 2, 1, 1, 2, 3, 1, 13, 21, 1 };
        int i = 0, j = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print("All Distinct number " + arr[i] + " ");
            }
        }
    }
}
