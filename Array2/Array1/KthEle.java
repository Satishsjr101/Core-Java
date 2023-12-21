import java.util.Scanner;

public class KthEle {
    public static int Kth(int[] arr, int[] arr1, int k, int n, int n1) {
        int[] sorted = new int[n + n1];
        int i = 0, j = 0, d = 0;
        while (i < n && j < n1) {
            if (arr[i] < arr1[j]) {
                sorted[d++] = arr[i++];
            } else {
                sorted[d++] = arr1[j++];
            }
        }
        while (i < n) {
            sorted[d++] = arr[i++];
        }
        while (j < n1) {
            sorted[d++] = arr1[j++];
        }
        System.out.print("Sorted Array [");
        for (int l = 0; l < sorted.length; l++) {
            System.out.print(sorted[l] + " ");
        }
        System.out.println("]");

        return sorted[k - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Array Size");
        int n = sc.nextInt();
        System.out.println("Entr Second Array Size ");
        int n1 = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n1];
        System.out.println("Enter first Array Element in Sorted forms");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Second Array Element in Sorted form");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Kth Position");
        int k = sc.nextInt();
        int t = Kth(arr, arr1, k, n, n1);
        System.out.println(k + "th Element is " + t);

    }
}
