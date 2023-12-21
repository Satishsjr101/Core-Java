// 52) WAP to find out all the Armstrong numbers between two entered numbers

import java.util.Scanner;

public class P52 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number ");
        int n2 = sc.nextInt();
        int rem, rev = 0;
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
