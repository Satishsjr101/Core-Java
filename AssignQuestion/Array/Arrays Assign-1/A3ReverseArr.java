// Q.3 Write a program to reverse the array.
public class A3ReverseArr {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        System.out.println("Reverse of arr ------");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
