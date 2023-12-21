//23. Write a Java program to find the sum and average of one dimensional integer array. 
public class A23 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        float aver = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        aver = (float) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + aver);
    }
}
