import java.util.Scanner;

public class P4primeNoInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = 2; j <= arr[i]; j++) {
                if (arr[i] % j == 0)
                    break;
            }
            if (j == arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
