// 61) WAP to find out all the leap years between two entered years

import java.util.Scanner;

public class P61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        for (int y = a; y <= b; y++) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                System.out.println(y + " is Leap year");
            }
        }
    }
}
