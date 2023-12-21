import java.util.Scanner;

public class Add4DgtNo {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int fDgt = n / 1000;
        int m1Dgt = (n / 100) % 10;
        int m2Dgt = (n / 10) % 10;
        int lDgt = n % 10;
        int rev = lDgt * 1000 + m2Dgt * 100 + m1Dgt * 10 + fDgt;
        System.out.println("Reverse of number: " + rev);
    }
}
