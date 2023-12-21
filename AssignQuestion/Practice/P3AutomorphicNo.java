import java.util.Scanner;

public class P3AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        double result;
        double rem = n % 10;
        result = Math.pow(n, 2);
        double rem2 = result % 10;
        if (rem == rem2)
            System.out.println("Automorphic number");
        else
            System.out.println("Not a Automorphic Number");
    }
}
