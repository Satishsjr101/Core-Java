//7) WAP to check whether entered number is prime or not

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Not a prime number");

        } else {
            System.out.println("Prime number");
        }

    }
}
