import java.util.Scanner;

public class ChechIsUprOrIsLwr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charater: ");
        char a = sc.next().charAt(0);

        if ((a >= 65) && (a <= 90)) {
            System.out.println("Upper Case..");
        } else if ((a >= 97) && (a <= 122)) {
            System.out.println("Lower Case..");
        } else {
            System.out.println("Another case..");
        }
    }
}
