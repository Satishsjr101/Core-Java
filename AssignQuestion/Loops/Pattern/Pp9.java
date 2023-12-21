/*
 *   *
 *  ***
 * *****
 *  ***
 *   /**/
public class Pp9 {
    public static void main(String[] args) {
        int k = 0;
        int n = 7;
        for (int i = 1; i <= n; i++) {
            // k = i <= 4 ? ++k : --k;
            if (i <= 4)
                ++k;
            else
                --k;

            for (int j = 1; j <= n; j++) {
                if (j >= 5 - k && j <= 3 + k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
