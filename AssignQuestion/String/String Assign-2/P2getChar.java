// 2. Write a Java program to get the character at the given index within the String

import java.util.Scanner;

public class P2getChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter Index: ");
        int index = sc.nextInt();

        if (index < 0 || index > s1.length()) {
            System.out.println("Invalid!, index must be 0 to " + (s1.length() - 1));
        } else {
            char result = s1.charAt(index);
            System.out.println("The character at index " + index + " is: " + result);
        }
        sc.close();
    }

}
