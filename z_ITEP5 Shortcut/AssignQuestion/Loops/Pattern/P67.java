/*------
    A
   B B
  C   C
 D     D
EEEEEEEEE
-------- */
public class P67 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i == 3 && (j == 2)) || (i == 4 && (j == 2 || j == 3)))
                    System.out.print("  ");
                else
                    System.out.print(ch + " ");

            }
            ch++;
            System.out.println();
        }
    }
}
