
//WAP to check wheater number is positive or negative
import java.util.Scanner;

public class P9 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Number is Negative.");
        } else {
            System.out.println("Number is positive.");
        }
    }
}
