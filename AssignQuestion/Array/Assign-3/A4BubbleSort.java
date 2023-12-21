import java.util.Scanner;

public class A4BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 10, 90, 40, 20, 60, 70, 30, 50 };
        System.out.print("Enter element : ");
        // int temp = 0;
        int i = 0, j = 1;
        for (i = 0; i < a.length - 1; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    // temp =
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }

            }
            System.out.print(a[i] + " ");
        }

    }
}
