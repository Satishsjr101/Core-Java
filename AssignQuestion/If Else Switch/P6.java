import java.util.Scanner;

public class P6 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("Greater: " + b);
        } else if (b < a) {
            System.out.println("Greater: " + a);
        } else {
            System.out.println("Invalid ");
        }
    }
}
