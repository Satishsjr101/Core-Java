// 51) WAP to reverse all the numbers between two entered numbers

import java.util.Scanner;

public class P51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a start number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a end number: ");
        int n2 = sc.nextInt();

        int count = 0, r, rev = 0, rem;
        for (int i = n1; i <= n2; i++) {
            int temp = i;
            rev = 0;
            while (temp != 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            System.out.println(i + " Reverse is " + rev);

        }

    }
}
