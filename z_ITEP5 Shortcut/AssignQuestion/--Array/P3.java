import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Array Size");
         int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter Array Element");
                arr[i]  = sc.nextInt();
         }
         for (int i = 0; i < arr.length; i++) {
            System.out.println("I : "+i+ " Element : "+arr[i]);
         }
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             sum = sum + arr[i];
         }
         System.out.println("Array Sum is "+sum);
    }
}
