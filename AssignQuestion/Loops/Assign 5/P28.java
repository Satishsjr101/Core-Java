//28) 1 	2	3	4	 Hello	6	7	8	9	Hello	11	12 ….

import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a nth terns: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            if (i % 5 == 0) {
                System.out.print("Hello ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
