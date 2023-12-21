/*------
A B C D E
 A B C D
  A B C
   A B
    A
---------- */
public class P72 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int sp = i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
