/*----
    A
   AB
  A_C
 A__D
ABCDE
------- */
public class P48 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            char ch = 'A';
            for (int sp = i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                if ((i == 3 && (j == 4)) || ((i == 2 && (j == 3 || j == 4)))) {
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
