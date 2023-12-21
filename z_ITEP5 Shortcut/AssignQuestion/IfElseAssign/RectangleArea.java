import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int width = sc.nextInt();
        System.out.println("Enter radius: ");
        int height = sc.nextInt();
        int area = width * height;
        System.out.println("Area of rectangle=" + area);
    }
}
