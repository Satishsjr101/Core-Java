/*. Find the 28th term of an Arithmetic Progression -21 -18 -15 -12 . . . . */
public class P44 {
    public static void main(String[] args) {
        int an, a1 = -21, n = 28, d = -18 - (-21);
        // an=a1+(n-1)d;
        an = a1 + (n - 1) * d;
        System.out.println("28th term of Ap: " + an);
    }
}
