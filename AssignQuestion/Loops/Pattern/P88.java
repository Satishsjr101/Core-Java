/*-------
    1
    2
    3
    4
123454321
    4
    3
    2
    1
-------- */
public class P88 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i >= 1 && i <= 4) && (j == 5)) {
                    System.out.print(i);
                } else if (i == 5 && (j >= 1 && j <= 5)) {
                    System.out.print(j);
                }
                if ((i >= 6 && i <= 9) && (j == 5)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 5; j >= i; j--) {
                if (i == 5 && (j >= 6 && j <= 9)) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}