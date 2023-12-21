//16) …... -6	-3	0	3	6	9	……. n terms	 

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a nth terns: ");
        int n = sc.nextInt();

        int a = -9;
        for (int j = 1; j <= n; j++) {
            int temp = a + 3;
            System.out.print(temp + " ");
            a = temp;
        }
        // int i = -6;
        // while (i <= n) {
        // System.out.print(i + " ");

        // i = i + 3;
        // }
    }
}
