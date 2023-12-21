
//Write a Java program to count total number of notes in given amount. 
import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount :");
        int amt = input.nextInt();
        int n500, n100, n50, n20, n10, n5, n2, n1;
        n500 = n100 = n50 = n20 = n10 = 0;
        if (amt >= 500)
            n500 = amt / 500;
        amt -= n500 * 500;
        if (amt >= 100)
            n100 = amt / 100;
        amt -= n100 * 100;
        if (amt >= 50)
            n50 = amt / 50;
        amt -= n50 * 50;
        if (amt >= 20)
            n20 = amt / 20;
        amt -= n20 * 20;
        if (amt >= 10)
            n10 = amt / 10;
        amt -= n10 * 10;

        System.out.println("Total Number of Notes");
        System.out.println("500 = " + n500);
        System.out.println("100 = " + n100);
        System.out.println("50 = " + n50);
        System.out.println("20 = " + n20);
        System.out.println("10 = " + n10);
    }
}
