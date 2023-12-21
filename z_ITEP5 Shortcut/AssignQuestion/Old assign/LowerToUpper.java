import java.util.Scanner;

public class LowerToUpper {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");

        char txt = sc.next().charAt(0);
        int z = ((int) txt) - 32;
        txt = (char) z;
        System.out.println(txt);
    }
}
