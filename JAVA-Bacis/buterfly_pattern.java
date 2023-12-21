import java.util.*;

public class buterfly_pattern {
    public static void Butterfly_Pattern(int n) {

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            // star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space-2*(n-i)
            for (int sp = 1; sp <= 2 * (n - i); sp++) {
                System.out.print(" ");
            }
            // star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space-2*(n-i)
            for (int sp = 1; sp <= 2 * (n - i); sp++) {
                System.out.print(" ");
            }
            // star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            Butterfly_Pattern(4);
            System.out.println("Enter 1 for Continue else Exit :");
            num = sc.nextInt();
        } while (num == 1);
    }
}
