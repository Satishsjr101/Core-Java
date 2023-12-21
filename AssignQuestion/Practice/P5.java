import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        new P5().chechForVotes(age);
        sc.close();
    }

    public void chechForVotes(int age) {
        if (age >= 18 && age <= 100)
            System.out.println("yes,Voting ");
        else
            System.out.println("Not eligible ");
    }
}
