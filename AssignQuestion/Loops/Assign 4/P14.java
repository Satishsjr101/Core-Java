import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int temp = n;
        while (temp != 0) {
            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }
        if (n == rev) {
            System.out.println("Number is Palindrome " + rev);
        } else {
            System.out.println("Not a Palindrome");
        }
        // System.out.println(rev);
    }
}
