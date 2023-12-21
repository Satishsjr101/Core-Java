import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        char ch = sc.nextLine().charAt(0);
        int a = ch;

        if ((a >= 65) && (a <= 90)) {
            System.out.println("Upper Case....");
        } else if ((a >= 97) && (a <= 122)) {
            System.out.println("Lower Case....");
        } else if ((a >= 48) && (a <= 57)) {
            System.out.println("Number");
        } else {
            System.out.println("special symbols");
        }
    }
}
