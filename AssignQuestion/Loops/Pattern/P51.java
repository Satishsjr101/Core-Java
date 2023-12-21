/*--
55555
 4444
  333
   22
    1
----- */
public class P51 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int sp = 4; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
