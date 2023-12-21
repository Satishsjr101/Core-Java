/*SATISH */
public class PP6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 50; j++) {

                if ((i == 1 || i == 3 || i == 5) && (j > 0 && j <= 3) || ((i == 2) && j == 1) || i == 4 && j == 3) {
                    System.out.print("*");
                } else if ((i > 0 && i <= n) && (j == (n * 2 + 1 - i)) || (i > 0 && i <= n) && (j == (n * 2 + 1 + i))
                        || (i == 3 && j >= 9 && j <= 13)) {
                    System.out.print("*");
                } else if ((i == 1 && (j >= 18 && j <= 22)) || (j == 20 && (i >= 2 && i <= 5))) {
                    System.out.print("*");
                } else if ((j >= 25 && j <= 29) && (i == 1 || i == 5) || (j == 27 && (i >= 2 && i <= 5))) {
                    System.out.print("*");
                } else if ((i == 1 || i == 3 || i == 5) && (j > 31 && j <= 34) || ((i == 2) && j == 32)
                        || i == 4 && j == 34) {
                    System.out.print("*");
                } else if ((j == 37 || j == 42) && (i > 0 && i <= 5) || (i == 3 && j >= 38 && j <= 41))
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}