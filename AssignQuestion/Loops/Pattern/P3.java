/*----------
*
 *
  *  
   *
    *
----------- */
public class P3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int sp = 0; sp <= i - 1; sp++) {
                System.out.print(" ");
            }
        }

    }
}
