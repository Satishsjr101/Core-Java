/*Q.1 Peak an element
An element is called a peak element if its value is not smaller than the value of 
its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. 
Otherwise output will be 0.

Example 1:
Input: N = 3
arr[] = {1,2,3}
Output: 1 
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbor 2.
Example 2:
Input: N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbor element 3.
Constraints:
1 ≤ N ≤ 105.
1 ≤ A[ ] ≤ 106
*/

import java.util.ArrayList;


public class PeakEle {
    public static int findPeak(ArrayList arrList) {
        int n = arrList.size();
        if (n == 1 || ( arrList.get(0) >arrList.get(1))) {
            return 0;
        }
        if (arrList.get(n - 1) >= arrList.get(n - 2)) {
            return n - 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (arrList.get(i) >= arrList.get(i - 1) && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrL1 = new ArrayList<>();
        arrL1.add(1);
        arrL1.add(2);
        arrL1.add(3);
        System.out.println("Index of peak element: " + findPeak(arrL1));

        ArrayList<Integer> arrL2 = new ArrayList<>();
        arrL2.add(3);
        arrL2.add(5);
        arrL2.add(9);
        arrL2.add(6);
        arrL2.add(2);
        System.out.println("Index of peak element: " + findPeak(arrL2));

    }
}
