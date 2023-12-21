
//WAP to check wheather number is even or odd
import java.util.Scanner;

public class P8 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number:");
        int n = sc.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println("Given Number is Even.");
                break;
            case 1:
            case -1:
                System.out.println("Given Number is Odd.");
                break;
        }
    }
}
