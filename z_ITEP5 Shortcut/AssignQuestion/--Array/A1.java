import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int a[] = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }

        for (int j = 5; j >= 0; j--) {
            System.out.println(a[j]);
        }
    }
}