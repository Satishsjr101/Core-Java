import java.util.Scanner;

public class AbsoluteVal {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value:");
        int val = sc.nextInt();
        if (val > 0) {
            System.out.println("Absolute: " + val);
        } else {
            System.out.println("Absolute: " + (-(val)));
        }

    }
}
