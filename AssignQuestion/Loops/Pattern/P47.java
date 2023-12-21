/*------
    1
   11
  1*1
 1**1
11111
----- */
public class P47 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {

            for (int sp = i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                if ((i == 3 && (j == 4)) || ((i == 2 && (j == 3 || j == 4)))) {
                    System.out.print("*");
                } else {
                    System.out.print(1);
                }

            }
            System.out.println();
        }
    }
}
