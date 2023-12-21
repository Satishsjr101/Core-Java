import java.util.*;
import java.io.*;

public class Transpose {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        System.out.println("Enter n: ");
        int n = in.nextInt();
        for (int i = 0; i < t; i++) {

            int s = a + 1 * b;
            System.out.println(s);
        }
        in.close();
    }
}