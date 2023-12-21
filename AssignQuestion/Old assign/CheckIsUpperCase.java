
import java.util.Scanner;

public class CheckIsUpperCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charater: ");
        char a = sc.next().charAt(0);

        boolean v1 = (a >= 65) && (a <= 90);

        boolean f = (v1) ? true : false;
        System.out.println("Upper Case.." + f);

    }
}
