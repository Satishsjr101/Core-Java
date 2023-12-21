import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            if (i == 0) {
                System.out.print(s1.toUpperCase());
            } else
                System.out.print(s1.toUpperCase());
        }
    }
}
