public class Pp8 {
    public static void main(String[] args) {
        int n = 5;
        int c = 0;

        int k = 0;
        for (int i = 1; i <= 7; i++) {
            k = i <= 4 ? ++k : --k;
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - k && j <= 3 + k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
