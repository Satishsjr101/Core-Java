import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array...");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " Number...");
        int a[] = new int[n];
        int i = 0;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (i = n - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }

    }
}
