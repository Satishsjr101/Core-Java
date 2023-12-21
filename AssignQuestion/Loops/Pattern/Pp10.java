/*KHU */
public class Pp10 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 25; j++) {
                if (j == 1 || ((i >= 1 && i <= 4) && (j == n - 1 - i)) || (i >= 5 && i <= 7) && j == i - 2) {
                    System.out.print("*");
                } else if ((i == 4 && (j >= 8 && j <= 12)) || ((j == 8 || j == 12))) {
                    System.out.print("*");
                } else if ((i == 7 && (j >= 15 && j <= 17)) || ((j == 14 || j == 18))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}