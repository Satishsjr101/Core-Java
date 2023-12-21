// 4. Write a Java program to count a number of Unicode code 
// points in the specified text range of a String

import java.util.Scanner;

public class P4findUnicodeInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter Start Index: ");
        int startIntdex = sc.nextInt();
        System.out.println("Enter End Index: ");
        int endIntdex = sc.nextInt();

        if (startIntdex < 0 || endIntdex > str.length() || startIntdex > endIntdex)
            System.out.println("Invalid Range!,index must be 0 to " + (str.length() - 1));
        else {
            int result = str.codePointCount(startIntdex, endIntdex);
            System.out.println("Unicode Points: " + result);
        }
        sc.close();
    }
}
