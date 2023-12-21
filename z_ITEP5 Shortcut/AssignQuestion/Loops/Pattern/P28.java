/*-------
1
123                                                                                                                                                                                                                                                                
12345
1234567
123456789
------ */
public class P28 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int n = 1;
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print(n);
                n++;

            }
            System.out.println();
        }
    }

}
