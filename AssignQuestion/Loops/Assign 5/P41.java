// 41) WAP to find out LCM of a number

import java.util.Scanner;

public class P41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first  Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        int gcd = 1, lcm = 1;
        int big = 0;
        int small = 0;
        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        for (int i = 1; i <= big; i++) {
            if (big % i == 0 && small % i == 0) {
                gcd = i;
            }
        }
        lcm = (big * small) / gcd;
        System.out.println("LCM " + lcm);
    }
}
