/*10.Take 20 integer inputs from user and print the following:
 number of positive numbers
 number of negative numbers
 number of odd numbers
 number of even numbers
 number of 0s
  */

import java.net.Socket;
import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int oCount = 0, eCount = 0, zeroCount = 0, pcount = 0, ncount = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                eCount++;
            } else {
                oCount++;
            }
            if (a[i] == 0) {
                zeroCount++;
            }
            if (a[i] > 0) {
                pcount++;
            }
            if (a[i] < 0) {
                ncount++;
            }

        }
        System.out.println("Total positive num: " + pcount);
        System.out.println("Total negative num: " + ncount);
        System.out.println("Total even number: " + eCount);
        System.out.println("Total Odd numbers: " + oCount);
        System.out.println("Total number of Zero: " + zeroCount);
    }
}
