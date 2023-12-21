//17)  1 	2	 4	 7	 11	 16 	…… n terms

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a nth terns: ");
        int n = sc.nextInt();
        int a = 1, b = 2, temp = 0;
        for (int j = 1; j <= n; j++) {

            if (a > 6) {
                temp = a + 4;
                System.out.print(a + " ");
            } else {
                temp = a + b + 1;
                System.out.print(a + " ");
            }
            a = b;
            b = temp;
        }
    }
}
