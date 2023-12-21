// 21) 1,	4,	9,	16,	25	…..

import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nth terns: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
