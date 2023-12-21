import java.util.Scanner;

public class Height {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height(in inches):");
        float h = sc.nextFloat();
        float convert = 2.54f * h;
        System.out.println("Height in cm : " + convert);

    }
}
