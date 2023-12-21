/*-----
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

------------ */
jgfvskjlfnvkjfdzxnvkjzs,mdxfncijzkm
import java.util.Scanner;

public class P65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P65().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 0; i <= n; i++) {
            int c = 0;
            for (int j = 0; j < i; j++) {
                if (c == 0) {
                    c = 1;
                    System.out.print(c + " ");
                } else {
                    c = c + (i - j) / j;
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
    }
}
