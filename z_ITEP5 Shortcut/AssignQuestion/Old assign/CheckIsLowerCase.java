import java.util.Scanner;

public class CheckIsLowerCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charecter: ");
        char a = sc.nextLine().charAt(0);

        boolean v1 = (a >= 97) && (a <= 122);
        boolean f = (v1) ? true : false;
        System.out.println("Lower Case.." + f);

    }
}
