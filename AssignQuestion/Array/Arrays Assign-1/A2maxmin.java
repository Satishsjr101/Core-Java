//Q.2 Find minimum and maximum element in array
public class A2maxmin {
    public static void main(String[] args) {
        int arr[] = { 21, 5004, 10002, 10, 200, 3000 };
        int max = arr[arr.length - 1];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            else if (max < arr[i])
                max = arr[i];

        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
