/*--------
a
ab
abc
abcd
abcde
------- */
public class P12 {
    public static void main(String[] args) {
        for (int i = 97; i <= 101; i++) {
            for (char ch = 97; ch <= i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
