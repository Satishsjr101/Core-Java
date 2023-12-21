// Q.4 Write a program to sort the array
public class A4sort {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, -12, -1, 4, 5 };
        int t = 0;
        System.out.println("Reverse of arr ------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
