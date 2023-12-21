import java.util.Scanner;

class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r;
        int c;
        int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

        for (r = 0; r < a.length; r++) {
            for (c = 0; c < a[r].length; c++) {

                if (r == c)
                    System.out.print(a[r][c] + " ");
                // if (r > c)
                // System.out.print(a[r][c] + " ");

            }
        }
    }
}