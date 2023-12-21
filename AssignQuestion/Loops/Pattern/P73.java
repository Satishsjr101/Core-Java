/*_____
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1
_________ */
public class P73 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
