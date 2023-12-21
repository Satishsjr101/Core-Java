public class P22 {
    public static void main(String[] args) {
        int rev;

        for (int i = 101; i < 199; i++) {
            int temp = i;
            rev = 0;
            while (temp != 0) {
                int r = temp % 10;
                rev = rev * 10 + r;
                temp = temp / 10;
            }
            if (i == rev) {
                System.out.println("Number is Palindrome " + rev);
            }
        }
    }
}
