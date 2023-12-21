import java.util.Scanner;

//W.A.P to check whether given number is even or odd Without using % operator
public class P18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if (((n / 2) * 2 == n)) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }

    }
}
