/*-----
    1
   10 
  101
 1010
10101
-------- */
public class P49 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {

            for (int sp = i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                if ((i + j) % 2 != 0) {
                    System.out.print("0");
                } else {lksjdflkjdlkkfjlkdsj
                    System.out.print("1");
                }

            }
            System.out.println();
        }
    }
}
