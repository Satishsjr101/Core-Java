import java.util.Scanner;

public class P38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = n, r, rev = 0;
        while (n > 0) {
            r = n % 10;
            rev = rev + r * r * r;
            n = n / 10;
        }
        if (num == rev) {
            System.out.print("Yes,Armstrong number");
        } else {
            System.out.println("Not, a Armstrong");
        }
    }
}
