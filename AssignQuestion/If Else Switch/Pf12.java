//A 4 digit number is entered through keyboard.
// Write a program to print a new number with digits reversed as of orignal one.

import java.util.Scanner;

public class Pf12 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 4 digit number: ");
        int num = sc.nextInt();
        int f, m1, m2, l, rev;
        f = num % 10;
        m1 = (num / 10) % 10;
        m2 = (num / 100) % 10;
        l = num / 1000;
        rev = f * 1000 + m1 * 100 + m2 * 10 + l;
        System.out.println("Reverse: " + rev);
    }
}
