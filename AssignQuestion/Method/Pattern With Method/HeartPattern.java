import java.util.Scanner;

public class HeartPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new HeartPattern().printHeartPattern(n);
        sc.close();
    }

    public void printHeartPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (i == 1 && ((j == 2 || j == 3 || j == 5 || j == 6)))
                    System.out.print("*");
                else if (i == 2 && ((j == 1 || j == 4 || j == 7)))
                    System.out.print("*");
                else if (((i - j) == 2) || ((i + j) == 10 && i >= 3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
