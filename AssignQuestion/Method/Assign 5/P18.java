// 18) 1	2	2	4	8	32	…… n terms

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a nth terns: ");
        int n = sc.nextInt();
        int i = 1, a = 1, b = 2, c;
        while (i <= n) {
            c = a * b;
            System.out.print(a + " ");
            a = b;
            b = c;
            i = i + 1;
        }
    }
}
