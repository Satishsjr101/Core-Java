// 46) WAP to find out the sum of first and last digit of a user entered number 

import java.util.Scanner;

public class P46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int l = n % 10, sum = 0, r, rev = 0;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        sum = rev % 10 + l;
        System.out.println("Sum: " + sum);
    }
}
