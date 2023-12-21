public class P19 {
    public static void main(String[] args) {
        double sum = 0;
        double r = 0;
        for (int i = 1; i <= 4; i++) {

            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            r = (double) i / fact;
            sum = sum + r;
        }
        System.out.println("sum " + sum);

    }
}
