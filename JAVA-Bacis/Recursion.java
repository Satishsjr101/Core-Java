import javax.lang.*;;

public class Recursion {
    public static void main(String args[]) throws java.lang.ClassNotFoundException {
        int n = 7;
        System.out.println(Fibo(20));

    }

    public static void Print_Dec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        Print_Dec(n - 1);
    }

    public static void Print_Inc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        Print_Inc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int Fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = Fibo(n - 1);
        int fnm2 = Fibo(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    

}