// 24) 0	4	16	36	64	….. 1 2 3 4 5 6 7 8

import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nth terns: ");
        int n = sc.nextInt();
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                System.out.print(i * i + " ");
            }
        }
    }
}
