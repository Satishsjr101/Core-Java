// Q.4 Write a program to sort the array

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ArrayList Size : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                if (arr.get(i) > arr.get(j)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        System.out.print(arr + " ");
    }
}
