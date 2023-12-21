public class A4Sort {
    public static void main(String[] args) {
        int a[] = { 1, 6, 3, 2, 4, 9, 16, 11 };

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = 0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");

        }
    }
}
