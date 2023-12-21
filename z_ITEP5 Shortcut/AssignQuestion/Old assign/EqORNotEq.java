import java.util.Scanner;

public class EqORNotEq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String eq = (a == b) ? "Equal" : "Not Equal";
        int g = (a > b) ? a : b;
        System.out.println("both numbers are " + eq);

        System.out.println(g + " is Greater");

    }
}
