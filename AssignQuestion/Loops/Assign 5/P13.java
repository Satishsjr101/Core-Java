//13) WAP to print N natural numbers in reverse order

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a number: ");
        int n = sc.nextInt();
        int rev = 0, r = 1;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
