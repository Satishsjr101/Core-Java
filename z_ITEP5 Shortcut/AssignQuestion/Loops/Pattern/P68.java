/*_____
    #
   *#* 
  **#** 
 ***#*** 
****#****
__________ */
public class P68 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1 || (i == 2 && j == 2) || (i == 3 && (j == 3)) || (i == 4 && j == 4) || (i == 5 && j == 5))
                    System.out.print("#");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
