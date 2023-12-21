// Write a Java program to swap first and last element of an integer 1-d array.
public class A4 {
    public static void main(String[] args) {
        int a[] = { 0, 8, 5, 4, 7, 61 };
        int temp = 0;

        for (int i = 0; i < a.length; i++) {

            if (i == 0 || i == a.length - 1) {
                temp = a[i];
                a[i] = a[a.length - 1];
                a[a.length - 1] = temp;
            }
            System.out.print(a[i] + " ");
        }
    }
}
