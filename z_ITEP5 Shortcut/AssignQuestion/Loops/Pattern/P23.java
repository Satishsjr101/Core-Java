/*------
a
bc
d f
g  j
klmno

-------- */
public class P23 {
    public static void main(String[] args) {
        char ch = 'a';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 3 && (j == 2)) {
                    System.out.print(" ");
                } else if (i == 4 && (j == 2 || j == 3)) {
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
