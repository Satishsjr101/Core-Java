public class P16 {
    public static void main(String[] args) {
        float a[] = { 2, 3, 4, 5, 67, 8, };
        float sum = 0;
        float avg = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
        avg = sum / a.length;
        System.out.println("Average of elements is :-  " + avg);
    }
}
