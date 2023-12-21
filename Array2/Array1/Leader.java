public class Leader {
    public static void main(String[] args) {
         int a[] = {1, 2, 3, 4, 5, 2};
        int max = 0;
        System.out.println("Leader in the array are :-");
        for (int i = a.length - 1; i >= 0; i--) {
            // for (int j = i + 1; j < a.length; j++) {
            if (a[i] > max) {
                max = a[i];
                System.out.println(max);

            }

        }
    }
}
