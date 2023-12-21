/*----
    A
   A B
  A B C
 A B C D
A B C D E  
------------ */
public class P59 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char ch = 'A';
            for (int sp = 4; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
