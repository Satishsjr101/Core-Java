/*
 * ABCDDCBA       // Static Program  BY Ritesh
 * ABC  CBA
 * AB    BA
 * A      A
 */
public class P1ABCDPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            char ch = 65;
            for (int j = 1; j <= 2 * n; j++) {

                if (j <= n + 1 - i || j >= n + i) {
                    System.out.print(ch);
                    ch = j < n ? ++ch : j == n ? ch : --ch;
                } else {
                    System.out.print(" ");
                    if (j == n)
                        ch--;
                }

            }

            System.out.println();
        }
    }
}
