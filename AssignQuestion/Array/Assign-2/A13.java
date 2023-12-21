/*Q.13 Find the Rotation Count in Rotated Sorted array
Given an array arr[] of size N having distinct numbers sorted in increasing 
order and the array has been right rotated (i.e, the last element will be 
cyclically shifted to the starting position of the array) k number of times, the 
task is to find the value of k.

Examples: 
Input: arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation: Initial array must be {2, 3, 6, 12, 15, 18}.
We get the given array after rotating the initial array twice.

Input: arr[] = {7, 9, 11, 12, 5}
Output: 4
Input: arr[] = {7, 9, 11, 12, 15};
Output: 0

(Using linear search): This problem can be solved using linear search.
If we take a closer look at examples, we can notice that the number of 
rotations is equal to the index of the minimum element. A simple linear 
solution is to find the minimum element and returns its index.

Illustration:
Consider the array arr[]={15, 18, 2, 3, 6, 12};
Initially minimum = 15, min_index = 0
At i = 1: min = 15, min_index = 0
At i = 2: min = min(2, 15) = 2, min_index = 2
At i = 3: min = 2, min_index = 2
At i = 4: min = 2, min_index = 2
At i = 5: min = 2, min_index = 2
The array is rotated twice to the right
Follow the steps mentioned below to implement the idea:
 Initialize two variables to store the minimum value and the index of that 
value.
 Traverse the array from start to the end:
 Find the minimum value and index where the minimum value is 
stored.
 Return the index of the minimum value.
Below is the code implementation of the above idea. */

public class A13 {
    public static void main(String[] args) {

    }
}
