/*
 *    56
 *   4567
 *  345678
 * 23456789
 * 
 */
class num {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j <= n + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}