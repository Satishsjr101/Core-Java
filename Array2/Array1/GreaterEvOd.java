public class GreaterEvOd {
    public static void main(String[] args) {
         int temp = 0;
        int a[] = { 2, 5, 8, 4, 6, 4, 7, 2, 1, 3 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0, j = 0, copy = (a.length - 1); i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.print(a[j] + " ");
                j++;
            } else {
                System.out.print(a[copy] + "  ");
                copy--;
            }
        }
    }
}
