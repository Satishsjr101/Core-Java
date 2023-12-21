//Check given character is vowel or not using switch case 

import java.util.Scanner;

public class P12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  String: ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a': {
                System.out.println("It is Vowels");
                break;
            }
            case 'e': {
                System.out.println("It is Vowels");
                break;
            }
            case 'i': {
                System.out.println("It is Vowels");
                break;
            }
            case 'o': {
                System.out.println("It is Vowels");
                break;
            }
            case 'u': {
                System.out.println("It is Vowels");
                break;
            }
            case 'A': {
                System.out.println("It is Vowels");
                break;
            }
            case 'E': {
                System.out.println("It is Vowels");
                break;
            }
            case 'I': {
                System.out.println("It is Vowels");
                break;
            }
            case 'O': {
                System.out.println("It is Vowels");
                break;
            }
            case 'U': {
                System.out.println("It is Vowels");
                break;
            }
            default: {
                System.out.println("It is not Vowels");
                break;
            }
        }
    }
}
