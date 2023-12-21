public class AddOne {
    public static void main(String[] args) {
        int arr1[] = { 50, 25, 32, 12, 6, 10, 100, 150 };
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] + 1;
        }
        System.out.println(arr1.length+"lllllllll");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
