import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales: ");
        float sales = sc.nextFloat();
        new P2().grossSales(sales);
        sc.close();

    }

    public void grossSales(float sales) {
        float bonus = 0;
        if (sales > 10000) {
            bonus = sales * (0.20f) + sales;
            System.out.println("Sales with Bonus: " + bonus);
        } else
            System.out.println("Sales: " + sales);

    }
}
