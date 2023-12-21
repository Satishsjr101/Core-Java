import java.util.Scanner;

public class SwapWithoutThirdVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("After Swapping:");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Before Swapping:");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
