public class Distinct {
    public static void main(String[] args) {
         int a[] = { 1, 2, 3, 4, 2, 2, 45, 3, 2, 5, 6, 7 };
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(a[i]+" ");
            }
        }
    }
}
