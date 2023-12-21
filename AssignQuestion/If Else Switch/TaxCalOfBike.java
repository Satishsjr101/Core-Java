import java.util.Scanner;

public class TaxCalOfBike {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of bike: ");
        float cost = sc.nextFloat();
        float tax = 0.0f;
        if (cost > 100000) {
            tax = cost * (0.15f);
        } else if (cost > 50000 && cost <= 100000) {
            tax = cost * (0.10f);
        } else if (cost <= 50000) {
            tax = cost * (0.05f);
        }
        System.out.println("you will pay: " + tax);
    }
}
