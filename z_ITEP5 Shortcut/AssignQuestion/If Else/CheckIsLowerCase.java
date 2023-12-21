import java.util.Scanner;

public class CheckIsLowerCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charecter: ");
        char a = sc.nextLine().charAt(0);

        if ((a >= 97) && (a <= 122)) {
            System.out.println("Lower Case..");
        } else {
            System.out.println("Not in Lower Case..");
        }
    }
}
