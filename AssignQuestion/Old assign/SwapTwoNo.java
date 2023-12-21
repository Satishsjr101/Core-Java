import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp = 0;

        System.out.println("After Swapping:");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        temp = x;
        x = y;
        y = temp;
        System.out.println("Before Swapping:");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
