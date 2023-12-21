
//Write a Java program to check whether a number is divisible by 5 and 11 or not
import java.util.Scanner;

public class P22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("Yes,It is Divisible by 5 .");

        } else if (num % 11 == 0) {
            System.out.println("Yes,It is Divisible by 11 .");
        } else {
            System.out.println("No !,It is Divisible by 5 and 11 .");

        }
    }
}