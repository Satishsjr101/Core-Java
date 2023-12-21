public class SubArray {
    public static void currentS(int[] arr, int sum) {
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == sum) {
                    System.out.println((i+1) + "   " + (j+1));
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 0, 0, 3, 10, 5};
        int sum = 7;
        currentS(arr, sum);
    }
}