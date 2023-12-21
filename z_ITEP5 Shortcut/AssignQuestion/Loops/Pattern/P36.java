/*------
ABCDE
A  D
A C
AB
A

------ */
public class P36 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                if (i == 4 && (j == 2 || j == 3) || i == 3 && j == 2) {
                    System.out.print(" ");
                } else {
                    System.out.print(ch);
                }
                ch++;
            }
            System.out.println();
        }
    }
}
