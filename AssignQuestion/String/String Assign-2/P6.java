/*6. Write a Java program to compare two strings lexicographically ,
     ignoring case differences
 */

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "Hello";
        String s2 = "hello";
        int checkLexico = s1.compareToIgnoreCase(s2);
        if (checkLexico == 0)
            System.out.println("Yes, Lexicographically Strings");
        else if (checkLexico < 0)
            System.out.println(s1 + " Lexicographically less than " + s2);
        else if (checkLexico > 0)
            System.out.println(s2 + " Lexicographically less than " + s1);
        else
            System.out.println("NO, Lexicographically");
        sc.close();
    }
}
