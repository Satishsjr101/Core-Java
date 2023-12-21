public class P21 {
    public static void main(String[] args) {
        int rev;
        for (int i = 101; i <= 199; i++) {
            int n = i;
            rev = 0;
            while (n != 0) {
                int r = n % 10;
                rev = rev * 10 + r;
                n = n / 10;
            }
            System.out.println(rev);

        }
    }
}
