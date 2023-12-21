import java.util.Scanner;

public class CheckSqareOrNot {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Breadth: ");
        int b = sc.nextInt();
        System.out.println("Enter Length: ");
        int l = sc.nextInt();

        if (l == b) {
            System.out.println("It is Square..");
        } else {
            System.out.println("It is not a Square..");
        }

    }
}
