import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
