// 26. Write a Java program to find the largest and smallest element of an array.
public class A26 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int s = arr[0];
        int l = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (s > arr[i])
                s = arr[i];
            else if (l < arr[i])
                l = arr[i];
        }
        System.out.println("Smallest: " + s);
        System.out.println("Largest: " + l);
    }
}
