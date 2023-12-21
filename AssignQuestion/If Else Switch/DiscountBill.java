import java.util.Scanner;

public class DiscountBill {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Quantity of Item: ");
        int qt = sc.nextInt();

        float unit = 100;
        float total = qt * unit;
        if (total >= 1000) {
            total = total - total * (0.10f);
        }
        System.out.println("Total cost :- " + total + "Rs.");
    }

}
