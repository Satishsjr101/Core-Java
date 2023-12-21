/* Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
*/

import java.util.Scanner;

public class Pf13 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("MonDay");
                break;
            case 2:
                System.out.println("TuesDay");
                break;
            case 3:
                System.out.println("WednesDay");
                break;
            case 4:
                System.out.println("ThursDay");
                break;
            case 5:
                System.out.println("FriDay");
                break;
            case 6:
                System.out.println("SaturDay");
                break;
            case 7:
                System.out.println("SunDay");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
