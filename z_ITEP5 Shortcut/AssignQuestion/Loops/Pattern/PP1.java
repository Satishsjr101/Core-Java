/*-------
   *
  ***
 *****
*******
 *****
  ***
   *
-------------- */
public class PP1 {
    public static void main(String[] args) {
        int n = 5;
        // 1st half
        for (int i = 1; i <= 5; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = 5; i >= 1; i--) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
