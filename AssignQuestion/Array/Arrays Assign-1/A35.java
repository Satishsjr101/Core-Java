// 35. Write a java program to implement selection sort algoritm
public class A35 {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 12 };

        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j])
                    small = j;
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
