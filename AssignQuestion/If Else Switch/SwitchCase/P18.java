import java.util.Scanner;

//W.A.P to check whether given number is even or odd Without using % operator
public class P18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int a = (((n / 2) * 2) == n) ? 1 : 2;
        switch (a) {
            case 1:
                System.out.println("Even number.");
                break;
            case 2:
                System.out.println("Odd number.");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
