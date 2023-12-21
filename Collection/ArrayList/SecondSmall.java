//  Q.5 Find the kth largest and kth smallest element in array.

import java.util.ArrayList;
import java.util.Scanner;

public class SecondSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ArrayList Size : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr.add(sc.nextInt());
        }
        System.out.println(arr);

        int max = -2147483647;
        int min = arr.get(0);

        for (int i = 0; i < n; i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
            if (min > arr.get(i)) {
                min = arr.get(i);
            }
        }
        System.out.println("MIN  : " + min);
        System.out.println("MAX  : " + max);
    }
}
