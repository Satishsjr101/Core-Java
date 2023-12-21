/*------
1
23
456
78910

------- */

import java.util.Scanner;

public class P14 {
    public void printPattern(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        P14 pn = new P14();
        pn.printPattern(n);
        sc.close();
    }
}
