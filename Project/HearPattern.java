/*
 * 1234
 *  234
 *   34
 *    4
 *   34
 *  234
 * 1234
 */
public class HearPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i < n * 2; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i > j && i <= n) || (j >= n * n - i - 1 && i > n)) {
                    System.out.print(" ");
                } else {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
