public class StarPatternPluss {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 5 || j == 5)
                    System.out.print("*");
                else if (j == 1 && i <= 4)
                    System.out.print("*");
                else if (i == 1 && j >= 6) {
                    System.out.print("*");
                } else if (j == 10 && i >= 6) {
                    System.out.print("*");
                } else if (i == 9 && j <= 5) {
                    System.out.print("*");
                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
