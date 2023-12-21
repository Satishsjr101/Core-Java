import java.util.Scanner;

public class A3BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 6, 3, 2, 4, 9, 16, 11 };
        System.out.print("Enter element : ");
        int ele = sc.nextInt();
        int low, high, mid;
        boolean flag = false;
        low = 0;
        high = a.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (ele == a[mid]) {
                flag = true;
                break;
            } else if (ele > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (flag)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");

    }
}
