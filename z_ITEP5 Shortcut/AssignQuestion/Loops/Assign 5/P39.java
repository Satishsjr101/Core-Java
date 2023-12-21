
// 39) WAP to check whether entered number is strong or not
import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1, sum = 0;
        int r, rev = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;

            }
            sum = sum + fact;
        }
        System.out.println("Fact: " + fact);
        System.out.println("Sum: " + sum);
    }
}
