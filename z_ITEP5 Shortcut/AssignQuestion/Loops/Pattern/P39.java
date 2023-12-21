/*---------
123456
54321
1234
321
12
1
----------- */
public class P39 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0)
                    System.out.print(j);
            }

            for (int j = i; j >= 1; j--) {

                if (i % 2 != 0) {
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
}
