// 29) 1	11	111	1111	  11111	……

import java.util.Scanner;

public class P29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nth terns: ");
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp = temp * 10 + 1;
            System.out.print(temp + " ");

        }
    }
}
