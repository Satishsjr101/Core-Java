public class P6 {
    public static void main(String[] args) {
        int a[] = { 4, 2, 11, 67, 91 };
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            for (j = 2; j <= a[i] / 2; j++) {
                if (a[i] % j == 0) {
                    break;
                }
            }
            if (j > a[i] / 2 && a[i] > 1) {
                System.out.println(a[i] + "is prime ");
            } else {
                System.out.println(a[i] + "is not prime");
            }
        }

    }
}
