
// 2 wap to ask 5 names from user and check if particular name exists in array or not .
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        int i;
        for (i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number: ");
        int name = sc.nextInt();
        int key = 0;

        for (i = 0; i < 5; i++) {
            if (name == a[i]) {

                key++;
                break;
            }
        }

        if (key > 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
