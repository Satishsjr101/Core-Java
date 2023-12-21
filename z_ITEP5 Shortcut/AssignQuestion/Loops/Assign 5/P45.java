// 45) WAP to find out the sum of all the digits of a number

import java.util.Scanner;

public class P45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int r, sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(" Sum: " + sum);
    }
}
