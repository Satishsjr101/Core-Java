/*--------
A
AB
ABC
ABCD
ABCDE
-------- */
public class P11 {
    public static void main(String[] args) {

        for (int i = 65; i <= 69; i++) {
            for (char ch = 65; ch <= i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
