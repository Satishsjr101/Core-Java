// 34) WAP to check whether entered number is perfect or not

import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum: " + sum);
        if (sum == n) {
            System.out.println("Perfect number ");
        } else {
            System.out.println("Not a perfect number");
        }

    }
}
