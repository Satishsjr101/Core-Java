//31) 9	99	999	9999	  99999 …….

import java.util.Scanner;

public class p31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nth terns: ");
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp = temp * 10 + 9;
            System.out.print(temp + " ");

        }
    }
}
