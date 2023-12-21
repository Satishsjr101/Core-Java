/*-----------
A
BCD
EFGHI    
JKLMNOP
----------- */
public class P41 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 8; i = i + 2) {
            for (int j = 1; j <= i; j++) {

                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
