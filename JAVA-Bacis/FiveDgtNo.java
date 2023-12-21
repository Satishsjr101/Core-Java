import java.util.Scanner;

public class FiveDgtNo {

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:(-----):");
        int n = sc.nextInt();
        int fDgt = ((n / 10000) + 1) % 10;
        int m1Dgt = (((n / 1000) % 10) + 1) % 10;
        int m2Dgt = (((n / 100) % 10) + 1) % 10;
        int m3Dgt = (((n / 10) % 10) + 1) % 10;
        int lDgt = ((n % 10) + 1) % 10;
        int rev = fDgt * 10000 + m1Dgt * 1000 + m2Dgt * 100 + m3Dgt * 10 + lDgt;
        System.out.println("Reverse of number: " + rev);
    }
}
