
//Write a Java program to calculate profit or loss.
import java.util.Scanner;

public class P25 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Costprice ");
        double cp = sc.nextDouble();
        System.out.println("Enter the Selling price:");
        double sp = sc.nextDouble();

        if (cp - sp > 0) {
            System.out.println("loss:" + (cp - sp));
        } else if (cp - sp < 0) {
            System.out.println("profit:" + (sp - cp));
        } else
            System.out.println("NEUTRAL");

    }
}
