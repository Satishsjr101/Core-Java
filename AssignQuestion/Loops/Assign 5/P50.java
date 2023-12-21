// 50) WAP to find out all the palindrome numbers between two entered numbers

import java.util.Scanner;

public class P50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a start number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a end number: ");
        int n2 = sc.nextInt();
        int rev = 0, rem, temp;

        for (int i = n1; i <= n2; i++) {
            temp = i;
            rev = 0;
            while (temp != 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            if (i == rev) {
                System.out.println("Number is Palindrome " + rev);
            }
        }
        sc.close();
    }

}
