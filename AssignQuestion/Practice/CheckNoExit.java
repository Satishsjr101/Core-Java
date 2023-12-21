import java.util.Scanner;

public class CheckNoExit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int arr[] = new int[5];
        boolean foundNo = false;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element of Arr: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to check: ");
        int flag = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == flag) {
                foundNo = true;
                break;
            }
        }
        if (foundNo)
            System.out.println("number Found");
        else
            System.out.println("Not Found");

    }
}
