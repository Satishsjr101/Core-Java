/*------
    A
   ABC
  ABCDE
 ABCDEEF
ABCDEFGHI
------------ */
public class P63 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int sp = 4; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
