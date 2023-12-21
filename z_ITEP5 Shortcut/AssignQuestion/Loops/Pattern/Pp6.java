/*     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1 

 */
public class Pp6 {
    public static void main(String[] args) {
        int n = 4;
        int c = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c = c * 11;
            }

            System.out.println();
        }
    }
}
