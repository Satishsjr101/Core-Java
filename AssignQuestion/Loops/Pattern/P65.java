/*-----
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

------------ */
public class P65 {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 0; i <= n; i++) {
            for (int sp = 4; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "  ");
                num = num * ((i - j) / (j));

            }
            System.out.println();
        }
    }
}
