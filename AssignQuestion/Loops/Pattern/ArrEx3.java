import java.util.Scanner;

public class ArrEx3 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}
