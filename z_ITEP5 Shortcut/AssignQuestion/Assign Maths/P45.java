//Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .
public class P45 {
    public static void main(String[] args) {

        int sn, an, a1 = -21, n = 28, d = -18 - (-21);
        // an=a1+(n-1)d;
        sn = (n / 2) * (2 * a1 + (n - 1) * d);
        System.out.println("Sum of 28th term of Ap: " + sn);

    }
}