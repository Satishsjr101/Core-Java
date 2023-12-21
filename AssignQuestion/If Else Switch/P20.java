
//W.A.P to check whether a charachter is an alphabet or not
import java.util.Scanner;

public class P20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charater: ");
        char a = sc.next().charAt(0);

        if ((a >= 65) && (a <= 90)) {
            System.out.println("Yes,Alphabate..");
        } else if ((a >= 97) && (a <= 122)) {
            System.out.println("Yes,Alphabate..");
        } else {
            System.out.println("Not,Alphabate..");
        }
    }
}
