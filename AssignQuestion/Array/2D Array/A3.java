public class A3 {
    public static void main(String[] args) {
        int r, c;
        int a[][] = { { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 } };
        for (r = 0; r < a.length; r++) {

            for (c = 0; c < a[r].length; c++) {
                if (c == a.length - 1 - r)
                    System.out.print(a[r][c] + " ");
            }
        }
    }
}
