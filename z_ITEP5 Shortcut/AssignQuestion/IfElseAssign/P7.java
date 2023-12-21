import java.util.Scanner;

public class P7 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Greater: " + a);
        } else if (b > a && b > c) {
            System.out.println("Greater: " + b);
        } else if (c > a && c > a) {
            System.out.println("Greater: " + c);
        } else {
            System.out.println("Please Enter number only");
        }
    }
}
