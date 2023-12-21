import java.util.Scanner;

public class P2SpyNo {
    // Spy Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int rem = 0,  sum = 0, multi = 1;
        while (n != 0) {
            rem = n % 10;
            sum = sum + rem;
            multi = multi * rem;
            n /= 10;
        }
        if (sum == multi) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }
}
