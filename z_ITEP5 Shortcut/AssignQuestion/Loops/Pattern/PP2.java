/*___

    * * * * *
   *       *
  *       *
 *       *
* * * * *
_____________ */
public class PP2 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < n * 2; j++) {

                if ((j == (n + 1) - i || j == (n * 2) - i)
                        || (i == 1 && (j >= n && j < n * 2))
                        || (i == n && (j >= 1 && j <= n))) {
                    System.out.print("*");
                }

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
