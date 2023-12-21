import java.util.Scanner;

public class MajorityEle {
    public static void Majority(int[] arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        if (count >= ((n + 1) / 2)) {
            System.out.println("x appears more than n/2 times in the given array");
        } else {
            System.out.println("x doesn't appear more than n/2 times in the given array");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Searched Element");
        int x = sc.nextInt();
        Majority(arr, n, x);

    }
}
