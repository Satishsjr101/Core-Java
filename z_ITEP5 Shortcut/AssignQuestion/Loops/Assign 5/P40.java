// 40) WAP to count no. Of even and odd digits in a number

import java.util.Scanner;

public class P40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int oddCount = 0, evenCount = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("evenCount: " + evenCount);
        System.out.println("oddCount: " + oddCount);
    }

}
