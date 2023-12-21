/*-------
    1
   1*1
  1***1
 1*****1
111111111
------------ */
public class P66 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if ((i == 2 && j == 2) || (i == 3 && (j == 2 || j == 3 || j == 4)))
                    System.out.print("*");
                else if ((i == 4 && (j == 2 || j == 3 || j == 4 || j == 5 || j == 6)))
                    System.out.print("*");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
