import java.util.Scanner;

public class SwallestBW3no {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("Smallest: " + a);
        } else if (b < a && b < c) {
            System.out.println("Smallest: " + b);
        } else if (c < a && c < a) {
            System.out.println("Smallest: " + c);
        } else {
            System.out.println("given Numbers is Equal...");
        }
    }
}
