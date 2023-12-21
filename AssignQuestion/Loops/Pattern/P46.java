/*----
    A
   AB
  ABC
 ABCD
ABCDE
------ */
public class P46 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            char ch = 'A';
            for (int sp = i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
