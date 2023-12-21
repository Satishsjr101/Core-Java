import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        System.out.println("Enter a Number ");
        int x = sc.nextInt();
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int r = x;
        for (int i = 2; i <= n; i++) {
            t = t + r;
            System.out.print(" " + r + "\n");
            r = r * x;
        }
        System.out.println(t);
    }
}
