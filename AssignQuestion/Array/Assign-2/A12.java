/*Q.12 Find the number of zeroes
Given an array of 1s and 0s which has all 1s first followed by all 0s. Find the 
number of 0s. Count the number of zeroes in the given array.
Examples :
Input: arr[] = {1, 1, 1, 1, 0, 0}
Output: 2
Input: arr[] = {1, 0, 0, 0, 0}
Output: 4
Input: arr[] = {0, 0, 0}
Output: 3
Input: arr[] = {1, 1, 1, 1}
Output: 0        */
public class A12 {
    public static void main(String[] args) {
        int a[] = { 1, 0, 0, 0, 0, 6, 0 };
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                count++;
        }
        System.out.println("number of zeros: " + count);
    }
}
