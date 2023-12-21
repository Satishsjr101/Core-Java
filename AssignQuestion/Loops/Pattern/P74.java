/*____
123456789
 1     7
  1   5
   1 3
    1
_____________ */
public class P74 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int sp = i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                if (i == 3 && (j == 2 || j == 3 || j == 4))
                    System.out.print(" ");
                else if (i == 2 && (j == 2 || j == 3 || j == 4 || j == 5 || j == 6))
                    System.out.print(" ");
                else if (i == 4 && (j == 2))
                    System.out.print(" ");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
