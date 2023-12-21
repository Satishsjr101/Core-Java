// 23) 1	9	25	49	81	…..

import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nth terns: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 != 0)
                System.out.print(i * i + " ");
        }
    }
}
