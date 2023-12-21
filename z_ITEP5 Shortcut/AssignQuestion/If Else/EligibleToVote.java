import java.util.Scanner;

public class EligibleToVote {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        if (age >= 18 && age <= 130) {
            System.out.println("Eligible for Vote..");
        } else {
            System.out.println("Not Eligible for Vote..");
        }
    }
}
