public class FactorialWithArrAndString {
    public static void main(String[] args) {
        int n = 21;
        long fact = 1;
        String factArr[] = { "" };
        for (int i = 1; i <= n; i++) {
            if (fact <= 9223372036854775806) {

            }
            fact = fact * i;
            factArr = Long.toString(fact);
        }
        System.out.println(factArr);
    }
}
