
// WAP to print Odd numbers upto N.
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
