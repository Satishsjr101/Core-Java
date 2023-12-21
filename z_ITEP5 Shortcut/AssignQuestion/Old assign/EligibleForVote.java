import java.util.Scanner;

public class EligibleForVote {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        String el = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(el);

    }
}
