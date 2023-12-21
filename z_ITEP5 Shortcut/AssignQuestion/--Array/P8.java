public class P8 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
            mul = mul * a[i];
        }
        System.out.println("Sum of All the elements of array is " + sum);
        System.out.println("product of All the elements of array is " + mul);
    }
}
