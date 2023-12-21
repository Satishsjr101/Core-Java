/*
 * Q.8 Given an unsorted array arr[] of size N having both negative and positive integers.
 *  The task is place all negative element at the end of array without changing the order of 
 * positive element and negative element.
Example 1:
Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5
Example 2:
Input :  N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output : 7  9  10  11  -5  -3  -4  -1

 */

import java.util.ArrayList;
import java.util.Scanner;

public class SortNegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(1);
        arrList.add(-1);
        arrList.add(3);
        arrList.add(2);
        arrList.add(-7);
        arrList.add(-5);
        arrList.add(11);
        arrList.add(6);

        System.out.println(arrList);

        for (int i = 0; i < arrList.size(); i++) {
            // if (arrList.get(i) < 0) {
            //     arrList.set(i, arrList.get(i));
            // }
            if (arrList.get(i) < 0) {
                arrList.set(i, arrList.get(i));
            }
        }
        System.out.println(arrList);
    }
}
