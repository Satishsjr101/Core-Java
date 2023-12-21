/*---------
1
22
3 3
4  4
55555
---------- */
public class P21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i == 3 && j == 2) || (i == 4 && (j == 2 || j == 3))) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
