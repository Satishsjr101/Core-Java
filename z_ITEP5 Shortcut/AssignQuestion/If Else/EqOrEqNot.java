import java.util.Scanner;

public class EqOrEqNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a == b)) {
            System.out.println("both numbers are Equals.");
        } else {
            System.out.println("both numbers are Not Equals.");
        }

        if ((a > b)) {
            System.out.println(a + " is Greater");
        } else {
            System.out.println(b + " is Greater");
        }
    }
}
