
//Write a Java program to input day number and print week day
import java.util.Scanner;

public class P23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        int day = sc.nextInt();
        float weak = day / 7;
        System.out.println("Total week " + weak);
    }
}
