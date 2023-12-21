/*---
    *
   *_*
  *___* 
 *_____* 
*********
---------- */
public class P64 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int sp = 4; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if ((i == 2 && j == 2) || (i == 3 && (j == 2 || j == 3 || j == 4))
                        || (i == 4 && (j == 2 || j == 3 || j == 4 || j == 5 || j == 6)))
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            System.out.println();

        }
    }
}
