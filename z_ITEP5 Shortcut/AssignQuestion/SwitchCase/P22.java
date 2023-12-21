
//Write a Java program to check whether a number is divisible by 5 and 11 or not
import java.util.Scanner;

public class P22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 5) {
            case 0:
                System.out.println("Yes,Divisible by 5 .");
                break;
            default:
                System.out.println("Not,Divisible by 5 .");
        }
        switch (num % 11) {
            case 0:
                System.out.println("Yes,Divisible by 11 .");
                break;
            default:
                System.out.println("Not,Divisible by  11 .");
        }
    }
}