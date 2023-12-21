// 1
// 2 11
// 3 10 12
// 4 9 13 18
// 5 8 14 17 19
// 6 7 15 16 20 21

import java.util.Scanner;

public class Pp23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            System.out.print(i + " ");
            int val = i;

            for (int j = 1; j < i; j++) {
                if (j % 2 != 0)
                    val = val + (2 * (row + 1 - i)) - 1;// val=1+(2*6-i-1)=1+12-1-1=11
                else
                    val = val + (2 * (i - j));
                // val = (j % 2 != 0) ? val + (2 * (row + 1 - i)) - 1 : val + (2 * (i - j));
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
