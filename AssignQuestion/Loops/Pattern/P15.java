/*--------
A
BB
CCC
DDDD
EEEEE
---------- */
public class P15 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            for (char ch = 'A'; ch <= i; ch++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
