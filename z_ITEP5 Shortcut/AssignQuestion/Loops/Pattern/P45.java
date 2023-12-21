/*----
    5 
   44
  333
 2222
11111
--------- */
public class P45 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int sp = i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
