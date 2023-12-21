
// WAP to find lowest number among four different number
import java.util.Scanner;

public class P14 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 Number:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        if (n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println("Lowest: " + n1);
        } else if (n2 < n1 && n2 < n3 && n2 < n4) {
            System.out.println("Lowest: " + n2);
        } else if (n3 < n1 && n3 < n2 && n3 < n4) {
            System.out.println("Lowest: " + n3);
        } else if (n4 < n1 && n4 < n2 && n4 < n3) {
            System.out.println("Lowest: " + n4);
        }
    }
}
