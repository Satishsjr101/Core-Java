//32) A	b	C	d	E	f	G	h	…… n terms 

public class P32 {
    public static void main(String[] args) {
        char ch = 97;
        for (ch = 97; ch <= 122; ch++) {
            if (ch % 2 == 0) {
                System.out.print(" " + ch + " ");
            } else {
                System.out.print((char) (ch - 32));

            }
        }
    }
}
