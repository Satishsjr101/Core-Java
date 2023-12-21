
//5) WAP to find out the factorial of a number
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a number: ");
        int n = sc.nextInt();
        new P5().printFactorial(n);
        sc.close();
    }

    public void printFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }
}
