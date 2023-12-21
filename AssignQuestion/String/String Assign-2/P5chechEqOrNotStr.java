/*5. Write a Java program to compare two strings lexicographically
    Two strings are lexicographically equal if they are the same length
    and contain the same characters in the same positions
 */

import java.util.Scanner;

public class P5chechEqOrNotStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter String2: ");
        String s2 = sc.nextLine();
        if (s1.contains(s2) && s1.length() == s2.length())
            System.out.println("Yes, Lexicographically Strings");
        else
            System.out.println("No, Lexicographically Strings");
        sc.close();
    }
}
