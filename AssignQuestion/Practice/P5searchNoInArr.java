import java.util.Scanner;

public class P5searchNoInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search: ");
        int element = sc.nextInt();

        boolean flag = false;
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == element) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("Element found ");
        else
            System.out.println("Not Found");
    }
}
