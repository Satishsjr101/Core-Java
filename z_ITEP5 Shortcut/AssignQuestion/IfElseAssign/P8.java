
//WAP to check wheather number is even or odd
import java.util.Scanner;

public class P8 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Given Number is Even.");
        } else {
            System.out.println("Given Number is Odd.");
        }
    }
}
