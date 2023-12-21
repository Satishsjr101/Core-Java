public class P13 {
    public static void main(String[] args) {
        int a[] = { 2, 6, 5, 8, 3, 9, 10 };
        int sum = 0;
        int value = 0;
        for (int i = 0; i < a.length; i++) {
            value = a[i] * a[i] * a[i];
            sum = sum + value;
            System.out.println(value);
        }
        System.out.println(sum + " sum");
    }
}
