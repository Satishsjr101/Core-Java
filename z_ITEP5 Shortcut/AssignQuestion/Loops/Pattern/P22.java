/*------
A
AB
A C
A  D
ABCDE
----- */
public class P22 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char chh = 'A';
            for (int j = 1; j <= i; j++) {

                if (i == 3 && j == 2) {
                    System.out.print(" ");
                } else if ((i == 4) && (j == 2 || j == 3)) {
                    System.out.print(" ");
                } else {
                    System.out.print(chh);
                }

                chh++;
            }
            System.out.println();
        }
    }
}
