/*
 * 1  2  3  4  5
 * 16 17 18 19 6
 * 15 24 25 20 7
 * 14 23 22 21 8
 * 13 12 11 10 9
 * 
 */
public class Pp22 {
    public static void main(String[] args) {
        int row = 5;
        int k = 1;
        int r = 5;
        int c = 5;
        // int a[][] = new int[r][c];
        for (int i = 1; i <= r; i++) {
            // System.out.print(i + " ");
            for (int j = 1; j <= r; j++) {
                if (i == 1)
                    System.out.print(k + " ");
                else if (i == 2)
                    System.out.print(r * 2 + k + " ");
                else if (i == 3)
                    System.out.print((k) + " ");
                else if (i == r)
                    System.out.print((r * 7 - 1 - k) + " ");
                k++;
            }
            System.out.println();
        }
        // System.out.println("1 2 3 4 5");
        // System.out.println("16 17 18 19 6");
        // System.out.println("15 24 25 20 7");
        // System.out.println("14 23 22 21 8");
        // System.out.println("13 12 11 10 9");
    }
}
