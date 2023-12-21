import java.net.SocketTimeoutException;
import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size..");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.println("Enter the array elements..");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements of Array are..");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
