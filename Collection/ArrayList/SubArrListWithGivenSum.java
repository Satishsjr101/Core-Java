/*
 * Q.7 Sub array with given sum
Given an unsorted array A of size N that contains only non-negative integers, 
find a continuous sub-array which adds to a given number S.
Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position is 12.
Example 2:
Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position is 15.
1 <= N <= 105
1 <= Ai <= 109
 */

import java.util.ArrayList;

// galat he
class P11 {
    public void SubArrList(ArrayList<Integer> al, int sum) {
        int sumChecker = al.get(0);
        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (sumChecker == sum) {
                    System.out.println((i + 1) + "  " + (j));
                }
                sumChecker += al.get(j);
            }
        }
    }
}

public class SubArrListWithGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(5);
        arrList.add(7);

        int sum = 12;
        new P11().SubArrList(arrList, sum);
    }
}
