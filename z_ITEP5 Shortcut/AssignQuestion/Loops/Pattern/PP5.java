/*------
    1
    2
    3
    4
123454321
    4
    3
    2
    1
---------- */
public class PP5 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (i > 0 && i <= n && j == 5)
                    System.out.print(i);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

    }
}
