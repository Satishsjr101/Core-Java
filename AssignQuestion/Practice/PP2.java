public class PP2 {
    public void ArmstrongNo(int n) {
        int m = n;
        int rev = 0, rem = 0;
        while (n != 0) {
            rem = n % 10;
            rev = (rem * rem * rem) + rev;
            n = n / 10;
        }
        if (rev == m)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a armstrong");
    }
}

class TestMain {
    public static void main(String[] args) {
        PP2 obj = new PP2();
        obj.ArmstrongNo(153);
    }
}
