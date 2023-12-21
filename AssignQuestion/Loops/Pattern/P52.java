/*---
12345
 1__4
  1_3
   12
    1
----- */
public class P52 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int sp = 4; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i == 4 && (j == 2 || j == 3)) || (i == 3 && j == 2)) {
                    System.out.print("_");
                } else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
