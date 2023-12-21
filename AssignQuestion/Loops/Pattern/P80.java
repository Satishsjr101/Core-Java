/*_____
   *
  *_*
 *_*_*
*_*_*_*
 *_*_*
  *_*
   *     
____________ */
public class P80 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if ((i == 2 && j == 2) || (i == 3 & (j == 2 || j == 4))) {
                    System.out.print("_");
                } else if ((i == 4 && (j == 2 || j == 4 || j == 6)))
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        // Reverse
        for (int i = n - 1; i >= 1; i--) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if ((i == 2 && j == 2) || (i == 3 & (j == 2 || j == 4))) {
                    System.out.print("_");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
