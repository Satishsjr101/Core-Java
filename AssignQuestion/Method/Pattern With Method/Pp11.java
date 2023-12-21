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
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= n * 2; j++) {

                if ((i >= 4) && (j == 1)) {
                    System.out.print(j + 1);
                } else if ((i >= 3) && (j == 2)) {
                    System.out.print(j + 1);
                } else if ((i >= 2) && (j == 3)) {
                    System.out.print(j + 1);
                } else if (j == 5)
                    System.out.print(j + 1);
                else if (j == 4)
                    System.out.print(j + 1);
                else if (j == 5)
                    System.out.print(j + 1);
                else if ((i >= 2) && (j == 6)) {
                    System.out.print(j + 1);
                } else if ((i >= 3) && (j == 7)) {
                    System.out.print(j + 1);
                } else if ((i >= 4) && (j == 8)) {
                    System.out.print(j + 1);
                } else {
                    System.out.print(" ");
                }

            }
            // k++;

            System.out.println();
        }
    }
}