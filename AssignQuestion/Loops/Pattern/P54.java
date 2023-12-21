/*----
ABCDE
 A__D
  A_C
   AB
    A
------ */
public class P54 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            char ch = 'A';
            for (int sp = 4; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 4 && (j == 2 || j == 3) || i == 3 && j == 2) {
                    System.out.print("_");
                } else {
                    System.out.print(ch);
                }
                ch++;
            }
            System.out.println();
        }
    }
}
