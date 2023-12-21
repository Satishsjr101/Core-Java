//WAP to calculate the sum of given series 1 - 2 + 3 - 4 + 5 - 6................n terms

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println("Sum " + (n + 1) / 2);
        } else {
            System.out.println("Sum " + (-n / 2));
        }

    }
}
