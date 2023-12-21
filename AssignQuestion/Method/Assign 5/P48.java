
// 48) WAP to find out the factors of all the numbers between two entered numbers
import java.util.Scanner;

public class P48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            int temp = i;
            for (int j = 1; j <= temp / 2; j++) {
                if (i % j == 0) {
                    System.out.print(j + "  ");
                }
            }
            System.out.println();
        }
    }
}
