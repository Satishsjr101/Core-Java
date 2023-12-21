/*Q.14 Find Subarray with given sum | Set 1 (Non-negative Numbers)
Given an array arr[] of non-negative integers and an integer sum, find a 
subarray that adds to a given sum.
Note: There may be more than one subarray with sum as the given sum, print 
first such subarray.

Examples:
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output: Sum found between indexes 1 and 4
Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
Explanation: There is no subarray with 0 sum

Find subarray with given sum using Nested loop
The idea is to consider all subarrays one by one and check the sum of every 
subarray. Following program implements the given idea.
Run two loops: the outer loop picks a starting point i and the inner loop tries 
all subarrays starting from i.
Follow the steps given below to implement the approach:
 Traverse the array from start to end.
 From every index start another loop from i to the end of the array to get all 
subarrays starting from i, and keep a variable currentSum to calculate 
the sum of every subarray.
 For every index in inner loop update currentSum = currentSum + arr[j]
 If the currentSum is equal to the given sum then print the subarray. */

public class A14 {
    public static void main(String[] args) {

    }
}
