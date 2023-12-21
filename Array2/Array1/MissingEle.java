import java.util.Scanner;

public class MissingEle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " Sorted Element in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array Element");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("I : " + i + " Element " + arr[i]);
        }
        int min = arr[0];
        int max = 0;
          for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // System.out.println(l);

        System.out.println();
         int j;
        for (int i = min; i <= max; i++) {
            for ( j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    break;
                }
            }
          
            if (j == arr.length) {
                System.out.println(i);
            }

         }


        //  int a[] = { 15, 10, 1, 2, 4, 8 };
        // int max = 0, min = a[0], i = 0, j = 0;

        // for (i = 0; i < a.length; i++) {
        //     if (a[i] > max) {
        //         max = a[i];
        //     }
        //     if (a[i] < min) {
        //         min = a[i];
        //     }
        // }
        // for (i = min; i < max; i++) {
        //     for (j = 0; j < a.length; j++) {
        //         if (a[j] == i) {
        //             break;
        //         }
        //     }
          
        //     if (j == a.length) {
        //         System.out.println(i);
        //     }

        // }
    }
}
