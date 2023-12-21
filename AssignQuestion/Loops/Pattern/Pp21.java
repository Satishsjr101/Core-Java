// 1
// 2 11
// 3 10 12
// 4 9 13 18
// 5 8 14 17 19
// 6 7 15 16 20 21

public class Pp21 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1)
                    System.out.print(i + " ");
                else if (j == 2)
                    System.out.print((n * 2 + 1) - i + " ");
                else if (j == 3)
                    System.out.print((n * 2 - 3) + i + " ");
                else if (j == 4)
                    System.out.print((n * 4 - 2) - i + " ");
                else if (j == 5)
                    System.out.print((n * 2 + 2) + i + " ");
                else if (j == n)
                    System.out.print(n * 4 - 3);
            }
            System.out.println();
        }
    }

}
