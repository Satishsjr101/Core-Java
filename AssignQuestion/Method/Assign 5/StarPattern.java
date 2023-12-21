import java.util.Scanner;

class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        new StarPattern().starPattern(n);
    }

    public void starPattern(int n) {
        for (int i = 1; i < 2 * n; i++) {

            for (int j = 1; j < 2 * n; j++) {
                if (i <= n) {
                    if ((j >= n + 1 - i) && (j <= n - 1 + i))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    if ((j > i - n) && (j < 3 * n - i))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}